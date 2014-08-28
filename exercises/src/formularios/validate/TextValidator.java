package formularios.validate;

public class TextValidator implements Validator {

	public TextValidator() {
		
	}

	@Override
	public boolean validar(String text) {
		for (char ch : text.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}

	
}
