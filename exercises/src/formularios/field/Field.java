package formularios.field;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import formularios.validate.Validator;

/**
 * Interfaz campo que define el comportamiento comun de todos los campos.
 * 
 */
public class Field {
	
	private String label;
	private String text;
	private Validator validator;
	
	public Field(String label, Validator validator){
		this.label = label;
		this.validator = validator;
	}
	
	/**
	 * Metodo que pide el dato para rellenar el valor del campo
	 */
	public void readData() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(label + ": ");
				text = consola.readLine();
				valido = validator.validar(text);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}
	
	/**
	 * Metodo que devuleve el valor del formulario de forma textual
	 * @return Devolvera el valor del campo en forma de texto
	 * @see Field#getString()
	 */
	public String getString() {
		return text;
	}
}
