package formularios.validate;

public class LengthValidator implements Validator {
	
	private int n;
	
	public LengthValidator(int n){
		this.n = n;
	}
	
	@Override
	public boolean validar(String text) {
		if(text.length() == n)
			return true;
		return false;
	}

}
