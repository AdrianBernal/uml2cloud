package es.uclm.uml2cloud.m2t.simcan.services;

//import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	
//import org.eclipse.uml2.uml.Stereotype;
//import org.eclipse.uml2.uml.Package;

public class TestService {

	public Boolean matchRE(String regularExpresion, String texto){
		Pattern pat = Pattern.compile(regularExpresion);
	    Matcher mat = pat.matcher(texto);
	    return mat.matches();
	}

		
//	public boolean hasStereotype(Package clazz, String stereotypeName) {
//	  List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
//	    for (Stereotype stereotype : stereotypes) {
//	      if (stereotype.getName().equals(stereotypeName)) {
//	        return true;
//	      }
//	    }
//	    return false;
//	  }
//
//	private static int indexOfLastMatch(Pattern pattern, String input) {
//	    Matcher matcher = pattern.matcher(input);
//	    for (int i = input.length(); i > 0; --i) {
//	        Matcher region = matcher.region(0, i);
//	        if (region.matches() || region.hitEnd()) {
//	            return i;
//	        }
//	    }
//
//	    return 0;
//	}
}
