package decorator;

public class Main {

	public static void main(String[] args) {
		Bebida cafe = new Cafe();
		cafe = new Nata(cafe);
		cafe = new Canela(cafe);
		System.out.println("Coste: " + cafe.cost());
	}

}
