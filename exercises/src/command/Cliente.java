package command;

public class Cliente {

	public static void main(String[] args) {
		Informacion info = new Informacion();
		Command a�adir1 = new A�adir(info);
		Executor executor = new Executor();
		executor.store(a�adir1);
		executor.run();
		Command a�adir2 = new A�adir(info);
		executor.store(a�adir2);
		executor.run();
	}

}
