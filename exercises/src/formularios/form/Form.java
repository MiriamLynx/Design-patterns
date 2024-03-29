package formularios.form;

import java.util.ArrayList;
import java.util.List;

import formularios.field.Field;

/**
 * Clase que define un formulario compuesto por campos
 */
public class Form {

	/**
	 * Coleccion de campos que forman el formulario
	 */
	private List<Field> fields = new ArrayList<Field>();

	/**
	 * Metodo que permite a�adir un campo al formulario
	 * 
	 * @param field
	 *            Campo a a�adir
	 */
	public void addField(Field field) {
		fields.add(field);
	}

	/**
	 * Metodo que pide los datos para rellenar el formulario. Lo hace pidiendo
	 * el data a cada uno de los campos.
	 */
	public void readData() {
		for (Field field : fields) {
			field.readData();
			System.out.println(field.getString());
		}
	}
}
