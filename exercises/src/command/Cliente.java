package command;

public class Cliente {

	public static void main(String[] args) {
		Informacion info = new Informacion();
		Command añadir1 = new Añadir(info);
		Executor executor = new Executor();
		executor.store(añadir1);
		executor.run();
		Command añadir2 = new Añadir(info);
		executor.store(añadir2);
		executor.run();
	}

}
