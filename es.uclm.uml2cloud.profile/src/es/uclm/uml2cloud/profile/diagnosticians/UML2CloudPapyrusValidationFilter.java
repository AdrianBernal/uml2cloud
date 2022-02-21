package es.uclm.uml2cloud.profile.diagnosticians;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.uml.service.validation.api.AbstractPapyrusValidationFilter;

public class UML2CloudPapyrusValidationFilter extends AbstractPapyrusValidationFilter {

	@Override
	public List<String> getExpectedValidationContext() {
		List<String> architectureContext = new ArrayList<String>();
		architectureContext.add("es.uclm.uml2cloud.architecture");
		return architectureContext;
	}

}
