package mayo.game;

import java.util.ArrayList;
import java.util.List;

import mayo.bloqueo.Bloqueo;
import mayo.deteccion.Deteccion;

public class Game {

	private List<Diana> dianas = new ArrayList<Diana>();
	private Deteccion deteccion;
	private Bloqueo bloqueo;

	public Game(Deteccion deteccion) {
		this.setDeteccion(deteccion);
	}

	public Game(Deteccion deteccion, Bloqueo bloqueo) {
		this.deteccion = deteccion;
		this.bloqueo = bloqueo;
	}

	public void add(List<Diana> dianas) {
		this.dianas.addAll(dianas);
	}

	public List<Diana> getDianasImpactadas(Impacto impacto) {
		List<Diana> impactadas = new ArrayList<Diana>();
		for (Diana diana : dianas) {
			if (deteccion.estaImpactada(diana, impacto)) {
				if (bloqueo == null || !bloqueo.hayBloqueo(diana)) {
					impactadas.add(diana);
				}
			}
		}
		if (bloqueo != null)
			bloqueo.reset();
		return impactadas;
	}

	public Deteccion getDeteccion() {
		return deteccion;
	}

	public void setDeteccion(Deteccion deteccion) {
		this.deteccion = deteccion;
	}

	public Bloqueo getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(Bloqueo bloqueo) {
		this.bloqueo = bloqueo;
	}
}
