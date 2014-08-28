package mayo.bloqueo;

import mayo.game.Diana;

public class Macizo implements Bloqueo {

	private boolean bloqueo;

	@Override
	public boolean hayBloqueo(Diana diana) {
		if (!bloqueo) {
			bloqueo = true;
			return false;
		}
		return bloqueo;
	}

	@Override
	public void reset() {
		bloqueo = false;
	}

}
