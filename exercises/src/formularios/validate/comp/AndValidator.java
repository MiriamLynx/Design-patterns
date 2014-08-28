package formularios.validate.comp;

import formularios.validate.CompositeValidator;
import formularios.validate.Validator;

public class AndValidator extends CompositeValidator {

	@Override
	public boolean validar(String text) {
		for(Validator v : listaValidators){
			if(!v.validar(text))
				return false;
		}
		return true;
	}

}
