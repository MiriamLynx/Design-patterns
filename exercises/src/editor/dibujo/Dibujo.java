package editor.dibujo;

import java.util.ArrayList;
import java.util.List;

import editor.figuras.Figura;

public class Dibujo {

	private List<Figura> listaFiguras;

	public Dibujo() {
		listaFiguras = new ArrayList<Figura>();
	}

	public void dibujar() {
		for (Figura f : listaFiguras) {
			f.dibujar();
			System.out.println("\n");
		}
	}

	public void addFigura(Figura figura) {
		listaFiguras.add(figura);
	}

	public Figura buscarFigura(int x, int y) {
		for (Figura f : listaFiguras) {
			if (f.contiene(x, y)) {
				return f;
			}
		}
		return null;
	}

}
