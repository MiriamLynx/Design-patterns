package composite;

public class Cancion implements ListaDeReproduccion {

	@Override
	public void sonar() {
		System.out.println("ninoninoni");
	}

	@Override
	public void addItem(ListaDeReproduccion l) {
		System.out.println("NOPE");
	}

	@Override
	public void removeItem(ListaDeReproduccion l) {
		System.out.println("NOPE");
	}

	@Override
	public ListaDeReproduccion getItem(int index) {
		System.out.println("NOPE");
		return null;
	}

}
