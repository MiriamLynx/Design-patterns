package state;

public class Main {

	/**
	 * En el caso en que haya un objeto cuyo estado interno cambia, se encapsula dicho estado.
	 */
	public static void main(String[] args) {
		Paint dibujo = new Paint();
		dibujo.setHerramienta(new Lapiz());
		dibujo.ejecutar();
		dibujo.setHerramienta(new Goma());
		dibujo.ejecutar();
	}

}
