package mayo.game;
import java.awt.*;

public class Diana {
	public Diana(Point centro, int diametro, int grosor) {
		this.centro = centro;
		this.diametro = diametro;
		this.grosor = grosor;
	}

	public Point getCentro() {
		return centro;
	}

	public int getDiametro() {
		return diametro;
	}

	public int getRadio() {
		return diametro / 2;
	}

	public int getGrosor() {
		return grosor;
	}

	public Rectangle getCuadrado() {
		return new Rectangle(centro.x - getRadio(), centro.y - getRadio(), diametro, diametro);
	}

	private Point centro;
	private int diametro;
	private int grosor;

}