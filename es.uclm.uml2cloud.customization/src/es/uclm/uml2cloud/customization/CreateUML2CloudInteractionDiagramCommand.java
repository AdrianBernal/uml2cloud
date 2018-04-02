package es.uclm.uml2cloud.customization;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.DiagramPrototype;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.common.commands.CreateBehavioredClassifierDiagramCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.SequenceDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.uml.diagram.wizards.command.InitFromTemplateCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.AbstractPapyrusGmfCreateDiagramCommandHandler;
import org.eclipse.papyrus.commands.RenameDiagramHandler;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;

public class CreateUML2CloudInteractionDiagramCommand extends CreateBehavioredClassifierDiagramCommand {
	private Diagram diagram;

	@Override
	protected EClass getBehaviorEClass() {
		return UMLPackage.eINSTANCE.getInteraction();
	}

	@Override
	protected String getDiagramNotationID() {
		return SequenceDiagramEditPart.MODEL_ID;
	}

	@Override
	protected PreferencesHint getPreferenceHint() {
		return UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected String getDefaultDiagramName() {
		return "CloudinSeqDiagram";
	}
	
	@Override
	protected void initializeModel(EObject owner) {
//		Behavior behavior = null;
//		if (owner.eClass() == getBehaviorEClass()) {
//			behavior = (Behavior) owner;
//
//		} else {
//			behavior = (Behavior) UMLFactory.eINSTANCE.create(getBehaviorEClass());
//
//			if (owner instanceof BehavioredClassifier) {
//				BehavioredClassifier behaviorClassifier = (BehavioredClassifier) owner;
//				behaviorClassifier.getOwnedBehaviors().add(behavior);
//
//				
//			} else if (owner instanceof Package) {
//				org.eclipse.uml2.uml.Package pack = (org.eclipse.uml2.uml.Package) owner;
//				pack.getPackagedElements().add(behavior);
//
//			}
//			behavior.setName(NamedElementUtil.getName(behavior));
			
//			ModelSet modelSet = (ModelSet)behavior.getModel();
//			System.out.println(modelSet);
//			
//			modelSet.getTransactionalEditingDomain().getCommandStack().execute(
//					new InitFromTemplateCommand(modelSet.getTransactionalEditingDomain(), modelSet, "es.uclm.simcan.examples", "baseCloudSystem\\cloudSystem.uml", "baseCloudSystem\\cloudSystem.notation",
//							"baseCloudSystem\\cloudSystem.di"));
			
//			//Añadir elementos del diagrama de secuencia al modelo
//			Resource myModelUMLResource = UmlUtils.getUmlResource((ModelSet)behavior.getModel());
//			Resource myModelDiResource = DiModelUtils.getDiResource(modelSet);
//			Resource myModelNotationResource = NotationUtils.getNotationResource(modelSet);
//			
//			
//			
//			String sourceModelPath = "/es.uclm.simcan.examples/baseCloudSystem/cloudSystem.uml";
//			URI modelUri = URI.createURI("platform:/plugin" + sourceModelPath);
//	        ResourceSet resourceSet = new ResourceSetImpl();
//	        Resource modelResource = resourceSet.getResource(modelUri, true);
//	        //CEPEventPattern pattern = (CEPEventPattern) modelResource.getContents().get(0);
//	        //System.out.println(modelResource.getContents());
//	        EcoreUtil.Copier copier = new EcoreUtil.Copier();
//	        Collection<EObject> umlObjects = copier.copyAll(modelResource.getContents().get(0).eContents().get(1).eContents());
//	        
//			eContents().addAll(umlObjects);
//		}
		ServicesRegistry registry;
		ModelSet modelSet;
		try {
			registry = ServiceUtilsForResource.getInstance().getServiceRegistry(owner.eResource());
			modelSet = registry.getService(ModelSet.class);
			AddFromTemplateCommand addFromTemplateCommand = new AddFromTemplateCommand(modelSet.getTransactionalEditingDomain(), modelSet, "es.uclm.simcan.examples", "baseCloudSystem\\baseCloudSystem.uml", "baseCloudSystem\\baseCloudSystem.notation",
					"baseCloudSystem\\baseCloudSystem.di");
			modelSet.getTransactionalEditingDomain().getCommandStack().execute(addFromTemplateCommand);
			Resource myModelNotationResource = NotationUtils.getNotationResource(modelSet);
			diagram = addFromTemplateCommand.getDiagram();
			diagram.setName(getName());
			System.out.println("a");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//super.initializeModel(owner);
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Diagram doCreateDiagram(Resource diagramResource, EObject owner, EObject element, DiagramPrototype prototype, String name) {
//		Diagram diagram = null;
//		if (element instanceof org.eclipse.uml2.uml.Package) {
//			diagram = ViewService.createDiagram(element, getDiagramNotationID(), getPreferenceHint());
//		} else if (element instanceof BehavioredClassifier) {
//			diagram = ViewService.createDiagram(((BehavioredClassifier) element).getNearestPackage(), getDiagramNotationID(), getPreferenceHint());
//		}
//		// create diagram
//		if (diagram != null) {
//			setName(name);
//			diagram.setElement(element);
//			DiagramUtils.setOwner(diagram, owner);
//			DiagramUtils.setPrototype(diagram, prototype);
			setName(name);
			EcoreUtil.delete(element);
			initializeModel(owner);
			
//			initializeDiagram(diagram);
//			diagramResource.getContents().add(diagram);
		//}
		return this.diagram;
	}
	
	@Override
	protected void initializeDiagram(EObject diagram) {
		// TODO Auto-generated method stub

		//super.initializeDiagram(diagram);
	}
	

}
