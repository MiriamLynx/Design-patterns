package strategy;

public class NoVolar implements FormaDeVolar {

	@Override
	public void volar() {
		System.out.println("No volar");
	}

}
