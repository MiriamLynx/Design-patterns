package editor.figuras;

import java.awt.Point;

public class Cuadrado implements Figura {

	private Point esquina;
	private int alto, ancho;

	public Point getEsquina() {
		return esquina;
	}

	public void setEsquina(Point posicion) {
		this.esquina = posicion;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public void dibujar() {
		
		System.out.println(this.toString());
	}
	
	@Override
	public void mover(int x, int y) {
		this.esquina.move(x, y);
		this.setAncho((int) (esquina.getX() + x));
		this.setAlto((int) (esquina.getY() + y));
	}

	@Override
	public boolean contiene(int x, int y) {
		boolean pinchado = (esquina.x <= x && x <= esquina.x + ancho) 
				&& (esquina.y <= y && y <= esquina.y + alto);
		return pinchado;
	}

	@Override
	public String toString() {
		return "Cuadrado [esquina=" + esquina + ", alto=" + alto + ", ancho="
				+ ancho + "]";
	}
	
	

}
