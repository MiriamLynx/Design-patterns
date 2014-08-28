package formularios.validate;

import java.util.List;

public abstract class CompositeValidator implements Validator {

	protected List<Validator> listaValidators;
	
	@Override
	public abstract boolean validar(String text);

}
