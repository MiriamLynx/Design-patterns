package editor.herramientas;

import java.awt.Point;

import editor.dibujo.Editor;
import editor.figuras.Cuadrado;

public class HCreacionCuadrado extends HCreacion {

	public HCreacionCuadrado(Editor editor) {
		super(editor);
	}

	@Override
	protected void doCrearFigura(Point inicio, Point fin) {

		Cuadrado cuadrado = new Cuadrado();

		cuadrado.setEsquina(inicio);
		cuadrado.setAncho(fin.x - inicio.x);
		cuadrado.setAlto(fin.y - inicio.y);

		editor.addFigura(cuadrado);

	}

}
