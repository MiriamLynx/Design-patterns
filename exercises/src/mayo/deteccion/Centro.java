package mayo.deteccion;

import mayo.game.Diana;
import mayo.game.Impacto;

public class Centro implements Deteccion {

	@Override
	public boolean estaImpactada(Diana diana, Impacto impacto) {
		return diana.getCentro().x == impacto.getPosicion().x
				&& diana.getCentro().y == impacto.getPosicion().y;
	}

}
