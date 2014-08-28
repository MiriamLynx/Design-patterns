package decorator;

public class Canela extends Topping {

	public Canela(Bebida bebida) {
		super(bebida);
	}
	
	@Override
	public double cost(){
		return 0.2 + super.cost();
	}

}
