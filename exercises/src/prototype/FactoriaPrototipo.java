package prototype;

import java.util.HashMap;

public class FactoriaPrototipo {

	private HashMap<String, Prototipo> mapa = new HashMap<String, Prototipo>();

	public FactoriaPrototipo() {
		mapa.put("Circulo peque�o", new Circulo(5));
		mapa.put("Circulo grande", new Circulo(10));
		mapa.put("Rectangulo peque�o", new Rectangulo(5, 5));
	}

	public Prototipo create(String prototipo) {
		return (Prototipo) mapa.get(prototipo).clonar();
	}

}
