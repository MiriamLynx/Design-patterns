package prototype;

public class Main {

	public static void main(String[] args) {
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		Prototipo prototipo = factoria.create("Circulo pequeño");
		System.out.println(prototipo.toString());
	}

}
