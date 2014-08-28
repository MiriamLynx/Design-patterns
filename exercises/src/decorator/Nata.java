package decorator;

public class Nata extends Topping {

	public Nata(Bebida bebida) {
		super(bebida);
	}

	@Override
	public double cost() {
		return 0.3 + super.cost();
	}

}
