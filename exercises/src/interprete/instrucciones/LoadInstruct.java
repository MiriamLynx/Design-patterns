package interprete.instrucciones;

import interprete.util.Estado;

public class LoadInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		int direccion = estadoActual.pop();
		estadoActual.push(estadoActual.getMemoria(direccion));
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
