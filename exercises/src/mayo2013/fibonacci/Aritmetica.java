package mayo2013.fibonacci;

import java.util.List;

public abstract class Aritmetica extends Operacion {
	
	private Operacion operacion;
	
	@Override
	public List<Double> execute(int number){
		return operacion.execute(number);
	}
	
	public Aritmetica(Operacion operacion){
		this.setOperacion(operacion);
	}

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

}
