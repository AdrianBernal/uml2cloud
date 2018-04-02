package es.uclm.uml2cloud.customization;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModelUtils;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.uml.diagram.wizards.utils.WizardsHelper;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Package;


/**
 * The Class InitFromTemplateCommand.
 */
public class AddFromTemplateCommand extends RecordingCommand {

	/** The my model resource. */
	private final Resource myModelUMLResource;

	/** The my model di resource. */
	private final Resource myModelDiResource;

	/** The my model notation resource. */
	private final Resource myModelNotationResource;

	/** The my template path. */
	private final String myUmlTemplatePath;

	/** The my di template path. */
	private final String myDiTemplatePath;

	/** The my notation template path. */
	private final String myNotationTemplatePath;

	/** The my plugin id. */
	private final String myPluginId;
	
	private Diagram diagram;


	/**
	 * Instantiates a new inits the from template command.
	 *
	 * @param editingDomain
	 *        the editing domain
	 * @param diResouceSet
	 *        the di resouce set
	 * @param pluginId
	 *        the plugin id
	 * @param umlTemplatePath
	 *        the uml template path
	 * @param notationTemplatePath
	 *        the notation template path
	 * @param diTemplatePath
	 *        the di template path
	 */
	public AddFromTemplateCommand(TransactionalEditingDomain editingDomain, ModelSet modelSet, String pluginId, String umlTemplatePath, String notationTemplatePath, String diTemplatePath) {
		super(editingDomain);
		myModelUMLResource = UmlUtils.getUmlResource(modelSet);
		myModelDiResource = DiModelUtils.getDiResource(modelSet);
		myModelNotationResource = NotationUtils.getNotationResource(modelSet);
		myPluginId = pluginId;
		myUmlTemplatePath = umlTemplatePath;
		myDiTemplatePath = diTemplatePath;
		myNotationTemplatePath = notationTemplatePath;
		diagram = null;
	}

	public Diagram getDiagram() {
		return diagram;
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		try {
			initializeFromTemplate();
			//verify if .di file and .notation file were filled in the org.eclipse.papyrus.uml.diagram.wizards.templates extension

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	/**
	 * Initialize from template.
	 *
	 *
	 * @throws IOException
	 *         Signals that an I/O exception has occurred.
	 */
	private void initializeFromTemplate() throws IOException {
		Resource templateDiResource = null;
		Resource templateNotationResource = null;
		Resource templateUmlResource = null;


		final ResourceSet resourceSet = new ResourceSetImpl();

		try {
			//0. initalization of the UML object
			templateUmlResource = loadTemplateResource(myUmlTemplatePath, resourceSet);
			EcoreUtil.resolveAll(templateUmlResource);

			//1. test if di and notation exist
			//verify if .di file and .notation file were filled in the org.eclipse.papyrus.uml.diagram.wizards.templates extension
			if((myDiTemplatePath != null) && (myNotationTemplatePath != null)) {
				//2.1 verify if the .di , .notation and .uml files have the same name
				String diFileName = WizardsHelper.getFileNameWithoutExtension(myDiTemplatePath);
				String umlFileName = WizardsHelper.getFileNameWithoutExtension(myUmlTemplatePath);
				String notationFileName = WizardsHelper.getFileNameWithoutExtension(myNotationTemplatePath);

				if(diFileName.contentEquals(umlFileName) && diFileName.contentEquals(notationFileName)) {

					//1.2 load  di resource
					if(myDiTemplatePath != null) {
						templateDiResource = loadTemplateResource(myDiTemplatePath, resourceSet);
						EcoreUtil.resolveAll(templateDiResource);
					}

					//1.3 load notation resource
					if(myNotationTemplatePath != null) {
						templateNotationResource = loadTemplateResource(myNotationTemplatePath, resourceSet);
						EcoreUtil.resolveAll(templateNotationResource);
					}

				}
			}

			//2. copy all elements
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			//Collection<EObject> umlObjects = copier.copyAll(templateUmlResource.getContents());
			Collection<EObject> umlObjects = copier.copyAll(templateUmlResource.getContents());
			Collection<EObject> diObjects = (templateDiResource == null) ? null : copier.copyAll(templateDiResource.getContents());
			Collection<EObject> notationObjects = (templateNotationResource == null) ? null : copier.copyAll(templateNotationResource.getContents());
			diagram = (Diagram) notationObjects.iterator().next();
			System.out.println("a");
			//Package modelToImport = (Package)templateUmlResource.getContents().get(0);
			Package modelToImport = (Package)umlObjects.iterator().next();
			EList<PackageableElement> elementsToImport =  modelToImport.getPackagedElements();
			Package myModel = (Package)myModelUMLResource.getContents().get(0);
			
			EList<PackageableElement> modelElements = myModel.getPackagedElements();
			for (PackageableElement modelElement : modelElements) {
				String modelElementName = modelElement.getName();
				for (PackageableElement elementToImport : elementsToImport) {
					String elementToImportName = elementToImport.getName();
					if (elementToImportName.equals(modelElementName)) {
						String lastCharacter = elementToImportName.substring(elementToImportName.length() - 1);
						try {
							Integer integer = Integer.parseInt(lastCharacter);
							integer++;
							elementToImportName=elementToImportName.substring(0,elementToImportName.length() - 1)+integer.toString();
						} catch (NumberFormatException e) {
							elementToImportName=elementToImportName+"1";
						}
						elementToImport.setName(elementToImportName);
					}
				}
			}
			
			myModel.getPackagedElements().addAll(elementsToImport);
			copier.put(templateUmlResource.getContents().get(0), myModelUMLResource.getContents().get(0));
			//System.out.println("a");
			//System.out.println("a");
			copier.copyReferences();
			//System.out.println("a");
			
//			//3. set copied elements in goods resources

			//EObject eo = umlObjects.iterator().next();
			//EList<EObject> el = eo.eContents();
			
			//myModelUMLResource.getContents().get(0).eContents().addAll(umlObjects);
			
			//EList<EObject> el = myModelUMLResource.getContents();
			
			//myModelUMLResource.getContents().addAll(umlObjects);
			if(diObjects != null) {
				//myModelDiResource.getContents().addAll(diObjects);
			}
			if(notationObjects != null) {
				myModelNotationResource.getContents().addAll(notationObjects);
			}
		} finally {
			EMFHelper.unload(resourceSet);
		}
	}



	/**
	 * Load template resource.
	 *
	 * @param path
	 *        the path
	 * @return the resource
	 */
	private Resource loadTemplateResource(String path, ResourceSet resourceSet) {
		java.net.URL templateURL = Platform.getBundle(myPluginId).getResource(path);
		if(templateURL != null) {
			String fullUri = templateURL.getPath();
			URI uri = URI.createPlatformPluginURI(myPluginId + fullUri, true);
			Resource resource = resourceSet.getResource(uri, true);
			if(resource.isLoaded()) {
				return resource;
			}
		}
		return null;
	}




}

