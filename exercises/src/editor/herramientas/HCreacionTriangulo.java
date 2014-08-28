package editor.herramientas;

import java.awt.Point;

import editor.dibujo.Editor;
import editor.figuras.Triangulo;

public class HCreacionTriangulo extends HerramientaAbstract {

	private Point p1, p2, p3;

	public HCreacionTriangulo(Editor editor) {
		super(editor);
	}

	@Override
	public void pinchar(int x, int y) {

		if (p1 == null)
			this.p1 = new Point(x, y);
		else
			pinchar2(x, y);
	}

	private void pinchar2(int x, int y) {
		if (p2 == null)
			this.p2 = new Point(x, y);
		else
			pinchar3(x, y);
	}

	private void pinchar3(int x, int y) {
		this.p3 = new Point(x, y);
		doCrearFigura();
	}

	private void doCrearFigura() {
		Triangulo triangulo = new Triangulo();

		triangulo.setV1(p1);
		triangulo.setV2(p2);
		triangulo.setV3(p3);

		editor.getDibujo().addFigura(triangulo);
	}

	@Override
	public void soltar(int x, int y) {
		System.out.println("No hay nada que soltar");
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("CACA, no puedes mover lo que no existe");
	}

}
