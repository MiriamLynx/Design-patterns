package composite;


public class Reproductor {

	public static void main(String[] args) {
		ListaDeReproduccion lista = new GrupoDeCanciones();
		lista.addItem(new Cancion());
		lista.addItem(new Cancion());
		ListaDeReproduccion listaSecundaria = new GrupoDeCanciones();
		listaSecundaria.addItem(new Cancion());
		lista.addItem(listaSecundaria);
		lista.sonar();
	}
	
}
