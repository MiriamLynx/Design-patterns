package mayo.bloqueo;

import mayo.game.Diana;

public class Grosor implements Bloqueo {

	private boolean bloqueo;
	private int grosor;

	public Grosor(int grosor) {
		this.grosor = grosor;
	}

	@Override
	public boolean hayBloqueo(Diana diana) {
		if (!bloqueo && diana.getGrosor() >= grosor) {
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
