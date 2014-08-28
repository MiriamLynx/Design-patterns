package interprete.instrucciones;

import interprete.util.Estado;

public class PushInstruct extends InstruccionAbstract {

	private String instruccionNum;

	public PushInstruct(String newInstruccionNum) {
		instruccionNum = newInstruccionNum;
	}

	@Override
	public Estado accion(Estado estadoActual) {
		estadoActual.push(Integer.parseInt(instruccionNum));
		estadoActual.incrementarIp();
		return estadoActual;
	}

}
