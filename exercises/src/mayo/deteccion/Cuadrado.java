package mayo.deteccion;

import mayo.game.Diana;
import mayo.game.Impacto;

public class Cuadrado implements Deteccion {

	@Override
	public boolean estaImpactada(Diana diana, Impacto impacto) {
		return diana.getCuadrado().contains(impacto.getPosicion());
	}



}
