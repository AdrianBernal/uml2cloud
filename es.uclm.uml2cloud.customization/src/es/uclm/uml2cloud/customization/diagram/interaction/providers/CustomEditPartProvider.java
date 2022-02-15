package es.uclm.uml2cloud.customization.diagram.interaction.providers;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.SilentEditpart;

import es.uclm.uml2cloud.customization.common.editpart.SilentConnectionEditPart;

public class CustomEditPartProvider extends org.eclipse.papyrus.uml.diagram.sequence.providers.CustomEditPartProvider {

	@Override
	protected IGraphicalEditPart createEditPart(View view) {
		IGraphicalEditPart graphicalEditPart = super.createEditPart(view);
		if (graphicalEditPart instanceof SilentEditpart) {
			return new SilentConnectionEditPart(view);
		}
		return graphicalEditPart;
	}

}
