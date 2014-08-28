package formularios.validate.comp;

import formularios.validate.LengthValidator;
import formularios.validate.NumericValidator;

public class PostcodeValidator extends AndValidator {

	public PostcodeValidator() {
		listaValidators.add(new NumericValidator());
		listaValidators.add(new LengthValidator(5));
	}

}
