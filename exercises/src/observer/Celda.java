package observer;

public class Celda extends Observable {
	
	private int valor;
	
	public Celda(int valor){
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		notificar();
	}

}
