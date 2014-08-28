package observer;

public class Printer implements Observador {
	
	private Celda celda;
	
	public Printer(Celda celda){
		this.celda = celda;
		celda.agregarObservador(this);
	}

	@Override
	public void update() {
		System.out.println("Valor: " + celda.getValor());
	}

	public Celda getCelda() {
		return celda;
	}

}
