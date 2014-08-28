package templateMethod;

public class Main {

	public static void main(String[] args) {
		Automovil secuencial = new AutomovilSecuencial();
		Automovil palanca = new AutomovilPalanca();
		secuencial.acelerar();
		palanca.acelerar();
	}

}
