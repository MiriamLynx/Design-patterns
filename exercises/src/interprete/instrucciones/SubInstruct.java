package interprete.instrucciones;

import interprete.util.Estado;

public class SubInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		int b = estadoActual.pop();
		int a = estadoActual.pop();
		estadoActual.push(a - b);
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
