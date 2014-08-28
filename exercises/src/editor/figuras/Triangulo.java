package editor.figuras;

import java.awt.Point;

public class Triangulo implements Figura {

	//vertices del triangulo
	private Point v1, v2, v3;
	
	public Point getV1() {
		return v1;
	}

	public void setV1(Point v1) {
		this.v1 = v1;
	}

	public Point getV2() {
		return v2;
	}

	public void setV2(Point v2) {
		this.v2 = v2;
	}

	public Point getV3() {
		return v3;
	}

	public void setV3(Point v3) {
		this.v3 = v3;
	}

	@Override
	public void dibujar() {
		
		System.out.println(this.toString());
	}

	@Override
	public void mover(int x, int y) {
		int distanciaX = x - v1.x;
		int distanciaY = y - v1.y;
		this.v1.move(x, y);
		this.v2.move(v2.x + distanciaX, v2.y + distanciaY);
		this.v3.move(v3.x + distanciaX, v3.y + distanciaY);
	}

	@Override
	public boolean contiene(int x, int y) {
		Point posicion = new Point(x,y);
		boolean pinchado = posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3);
		return pinchado;
	}

	@Override
	public String toString() {
		return "Triangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	

}
