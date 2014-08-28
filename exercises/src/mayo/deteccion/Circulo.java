package mayo.deteccion;

import java.awt.Point;

import mayo.game.Diana;
import mayo.game.Impacto;

public class Circulo implements Deteccion {

	@Override
	public boolean estaImpactada(Diana diana, Impacto impacto) {
		Point punto = impacto.getPosicion();
		Point centro = diana.getCentro();
		return (Math.sqrt(Math.pow(centro.x - punto.x, 2)
				+ Math.pow(centro.y - punto.y, 2)) <= diana.getRadio());
	}
}
