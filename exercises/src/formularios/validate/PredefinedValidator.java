package formularios.validate;

public class PredefinedValidator implements Validator {

	private String[] values;
	
	public PredefinedValidator(String... values) {
		this.values = values;
	}

	@Override
	public boolean validar(String text) {
		for (String valor : values) {
			if (text.toLowerCase().equals(valor.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
