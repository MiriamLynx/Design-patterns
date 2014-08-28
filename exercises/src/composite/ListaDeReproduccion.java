package composite;

public interface ListaDeReproduccion {

	public void addItem(ListaDeReproduccion l);

	public void removeItem(ListaDeReproduccion l);

	public ListaDeReproduccion getItem(int index);

	public void sonar();

}
