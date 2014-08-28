package interprete.instrucciones;

import interprete.util.Estado;

public class JmpInstruct extends InstruccionAbstract {

	private String instruccionNum;

	public JmpInstruct(String newInstruccionNum) {
		instruccionNum = newInstruccionNum;
	}

	@Override
	public Estado accion(Estado estadoActual) {
		estadoActual.setIp(Integer.parseInt(instruccionNum));
		return estadoActual;
	}

}
