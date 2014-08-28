package state;

public class Paint {

	private Herramienta herramienta;

	public Paint() {
	}

	public void ejecutar() {
		this.herramienta.execute();
	}

	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}

}
