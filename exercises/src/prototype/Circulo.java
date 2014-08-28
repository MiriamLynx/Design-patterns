package prototype;

public class Circulo implements Prototipo {
	
	private int radio;
	
	public Circulo(int radio){
		this.radio = radio;
	}

	@Override
	public Object clonar() {
		return new Circulo(this.radio);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
