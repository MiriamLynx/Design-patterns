package singleton;

public class Main {

	public static void main(String[] args) {
		Singletonitis singletonitis = Singletonitis.getInstance();
		singletonitis.print();
	}

}
