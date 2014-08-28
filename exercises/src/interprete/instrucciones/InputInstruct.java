package interprete.instrucciones;

import interprete.util.Estado;

import java.util.Scanner;

public class InputInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		estadoActual.push(leerValor());
		estadoActual.incrementarIp();
		return estadoActual;
	}

	@SuppressWarnings("resource")
	private int leerValor() {
		System.out.println("Escriba un entero:");
		return new Scanner(System.in).nextInt();
	}
}
