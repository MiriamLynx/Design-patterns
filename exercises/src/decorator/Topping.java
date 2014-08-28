package decorator;

public abstract class Topping extends Bebida{
	
	private Bebida bebida;
	
	public Topping(Bebida bebida){
		this.bebida = bebida;
	}

	public Bebida getBebida() {
		return bebida;
	}

	@Override
	public double cost(){
		return bebida.cost();
	}
}
