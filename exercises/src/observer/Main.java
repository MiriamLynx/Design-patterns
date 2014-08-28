package observer;

public class Main {

	public static void main(String[] args) {
		Celda celdaA = new Celda(0);
		new Printer(celdaA);
		new CrazyPrinter(celdaA);
		celdaA.setValor(5);
		celdaA.setValor(10);
		celdaA.setValor(15);
		
		System.out.println("----------------");
		
		Celda celdaB = new Celda(0);
		new Printer(celdaB);
		celdaB.setValor(5);
		celdaB.setValor(10);
		celdaB.setValor(15);
	}

}
