package editor.figuras;

import java.awt.Point;

public class Circulo implements Figura {

	private Point centro;
	private int radio;
	
	public Point getCentro() {
		return centro;
	}

	public void setCentro(Point centro) {
		this.centro = centro;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(Point posicion) {
		int distancia = (int) Math.sqrt(Math.pow(posicion.getX() - centro.x, 2) + Math.pow(posicion.getY() - centro.y, 2));
		this.radio = distancia;
	}

	@Override
	public void dibujar() {
		
		System.out.println(this.toString());
	}

	@Override
	public void mover(int x, int y) {
		
		this.centro.move(x, y);
	}

	@Override
	public boolean contiene(int x, int y) {
		double distancia = Math.sqrt(Math.pow(x - centro.x, 2) + Math.pow(y - centro.y, 2));
		boolean pinchado = distancia < radio;
		return pinchado;
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	

}
