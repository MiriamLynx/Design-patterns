package interprete.instrucciones;

import interprete.util.Estado;

public class OutputInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		System.out.println(estadoActual.pop());
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
