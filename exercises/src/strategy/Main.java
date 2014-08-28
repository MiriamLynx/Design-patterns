package strategy;

public class Main {

	/**
	 * En el caso en que haya un tipo de objeto que pueda hacer acciones de diferentes formas, se encapsulan estas formas mediante este patron.
	 */
	public static void main(String[] args) {
		Pato pita = new Pato(new Graznido(), new NoVolar());
		pita.graznar();
		pita.volar();
	}

}
