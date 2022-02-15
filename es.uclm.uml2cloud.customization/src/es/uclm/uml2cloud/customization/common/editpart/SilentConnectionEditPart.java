package es.uclm.uml2cloud.customization.common.editpart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.SilentEditpart;

public class SilentConnectionEditPart extends SilentEditpart implements ConnectionEditPart {

	public SilentConnectionEditPart(EObject model) {
		super(model);
	}

	
	private EditPart sourceEditPart, targetEditPart;
	
	@Override
	public EditPart getSource() {
		return sourceEditPart;
	}

	@Override
	public EditPart getTarget() {
		return targetEditPart;
	}

	@Override
	public void setSource(EditPart source) {
		sourceEditPart = source;

	}

	@Override
	public void setTarget(EditPart target) {
		targetEditPart = target;
	}

}
