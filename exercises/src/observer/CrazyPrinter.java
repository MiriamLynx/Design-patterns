package observer;

public class CrazyPrinter implements Observador {
	
	private Celda celda;
	
	public CrazyPrinter(Celda celda){
		this.celda = celda;
		celda.agregarObservador(this);
	}

	@Override
	public void update() {
		System.out.println("Valor crazy: " + celda.getValor());
	}

	public Celda getCelda() {
		return celda;
	}

}
