package interprete.instrucciones;

import interprete.util.Estado;

public interface InstruccionInterface {

	public abstract Estado accion(Estado estadoActual);

}
