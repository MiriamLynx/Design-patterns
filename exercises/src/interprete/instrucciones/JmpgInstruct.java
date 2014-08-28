package interprete.instrucciones;

import interprete.util.Estado;

public class JmpgInstruct extends InstruccionAbstract {

	private String instruccionNum;

	public JmpgInstruct(String newInstruccionNum) {
		instruccionNum = newInstruccionNum;
	}

	@Override
	public Estado accion(Estado estadoActual) {
		int b = estadoActual.pop();
		int a = estadoActual.pop();
		if (a > b)
			estadoActual.setIp(Integer.parseInt(instruccionNum));
		else
			estadoActual.incrementarIp();
		return estadoActual;
	}

}
