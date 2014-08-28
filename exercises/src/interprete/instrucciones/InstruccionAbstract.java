package interprete.instrucciones;

import interprete.util.Estado;

public abstract class InstruccionAbstract implements InstruccionInterface {

	public abstract Estado accion(Estado estadoActual);

}
