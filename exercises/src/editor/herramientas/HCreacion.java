package editor.herramientas;

import java.awt.Point;

import editor.dibujo.Editor;

public abstract class HCreacion extends HerramientaAbstract {

	private Point inicio, fin;

	public HCreacion(Editor editor) {
		super(editor);
	}

	@Override
	public void pinchar(int x, int y) {
		inicio = new Point(x, y);
	}

	@Override
	public void soltar(int x, int y) {
		fin = new Point(x, y);
		if (inicio == null)
			System.out.println("No hay un punto de origen");
		else
			doCrearFigura(inicio, fin);
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("CACA, no puedes mover lo que no existe");
	}

	protected abstract void doCrearFigura(Point inicio, Point fin);

}
