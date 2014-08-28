package interprete.instrucciones;

import interprete.util.Estado;

public class StoreInstruct extends InstruccionAbstract {

	@Override
	public Estado accion(Estado estadoActual) {
		int valor = estadoActual.pop();
		int direccion = estadoActual.pop();
		estadoActual.setMemoria(direccion, valor);
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
