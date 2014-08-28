package prototype;

public class Rectangulo implements Prototipo {
	
	private int ancho;
	private int largo;
	
	public Rectangulo(int ancho, int largo){
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public Object clonar() {
		return new Rectangulo(this.ancho, this.largo);
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", largo=" + largo + "]";
	}

}
