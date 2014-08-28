package composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeCanciones implements ListaDeReproduccion {

	List<ListaDeReproduccion> lista = new ArrayList<ListaDeReproduccion>();

	public void addItem(ListaDeReproduccion cosa) {
		lista.add(cosa);
	}

	public void removeItem(ListaDeReproduccion cosa) {
		lista.remove(cosa);
	}

	public ListaDeReproduccion getItem(int index) {
		return lista.get(index);
	}

	@Override
	public void sonar() {
		for (ListaDeReproduccion l : lista) {
			l.sonar();
		}
	}

}
