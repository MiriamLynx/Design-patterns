package editor.herramientas;

import java.awt.Point;

import editor.dibujo.Editor;
import editor.figuras.Circulo;

public class HCreacionCirculo extends HCreacion {

	public HCreacionCirculo(Editor editor) {
		super(editor);
	}

	@Override
	protected void doCrearFigura(Point inicio, Point fin) {
		
		Circulo circulo = new Circulo();
		
		circulo.setCentro(inicio);
		circulo.setRadio(fin);
		
		editor.addFigura(circulo);
	}

}
