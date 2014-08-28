package formularios.validate;

public class NumericValidator implements Validator {

	public NumericValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar(String text) {
		for (char ch : text.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
