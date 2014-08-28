package interprete.instrucciones;

import interprete.util.Estado;

public class MulInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		estadoActual.push(estadoActual.pop() * estadoActual.pop());
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
