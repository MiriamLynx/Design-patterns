package formularios.main;

import formularios.field.Field;
import formularios.form.Form;
import formularios.validate.NumericValidator;
import formularios.validate.PredefinedValidator;
import formularios.validate.TextValidator;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new Field("Nombre", new TextValidator()));
		form.addField(new Field("Apellido", new TextValidator()));
		form.addField(new Field("Telefono", new NumericValidator()));
		form.addField(new Field("Ciudad (Santander, Oviedo, Cadiz)",
				new PredefinedValidator("Santander", "Oviedo", "Cadiz")));

		form.readData();
	}
}
