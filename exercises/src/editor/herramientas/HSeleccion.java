package editor.herramientas;

import editor.dibujo.Editor;
import editor.figuras.Figura;

public class HSeleccion extends HerramientaAbstract {

	protected Figura figuraSeleccionada;

	public HSeleccion(Editor editor) {
		super(editor);
		figuraSeleccionada = null;
	}

	@Override
	public void pinchar(int x, int y) {

		figuraSeleccionada = editor.buscarFigura(x, y);

		if (figuraSeleccionada == null)
			System.out.println("Ninguna figura ha sido seleccioanda");
		else
			System.out.println("Figura: " + figuraSeleccionada.toString()
					+ " ha sido seleccionada");
	}

	@Override
	public void soltar(int x, int y) {
		if (figuraSeleccionada == null)
			System.out.println("No hay ninguna figura seleccionada");
		figuraSeleccionada = null;
	}

	@Override
	public void mover(int x, int y) {

		if (figuraSeleccionada == null)
			System.out.println("No hay una figura seleccionada");
		else
			figuraSeleccionada.mover(x, y);
	}

}
