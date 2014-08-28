package mayo2013.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import mayo2013.fibonacci.Entre;
import mayo2013.fibonacci.Fibonacci;
import mayo2013.fibonacci.Mas;
import mayo2013.fibonacci.Por;
import mayo2013.fibonacci.Redondeo;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Double> values = new Fibonacci().execute(10);
		System.out.println(values);

		values = new Mas(new Fibonacci(), 2).execute(10);
		System.out.println(values);
		
		values = new Entre(new Fibonacci(), 5).execute(10);
		System.out.println(values);
		
		values = new Redondeo(new Entre(new Fibonacci(), 5)).execute(10);
		System.out.println(values);
		
		procesaOrdenes();

	}

	public static void procesaOrdenes() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Comandos:");
		System.out.println("s <num>\t\t\tsuma");
		System.out.println("m <num>\t\t\tmultiplica");
		System.out.println("d <num>\t\t\tdivide");
		System.out.println("r\t\t\tredondea");
		System.out.println("exit\t\t\tfinaliza el programa");

		do {
			System.out.print(">");
			String[] word = in.readLine().split(" ");

			if (word[0].equals("exit")) {
				return;
			}

			if (word[0].equals("s")) {
				System.out.println("suma " + Integer.parseInt(word[1]));
				System.out.println(new Mas(new Fibonacci(), Integer.parseInt(word[1])).execute(10));
			} else if (word[0].startsWith("m")) {
				System.out.println("multiplica " + Integer.parseInt(word[1]));
				System.out.println(new Por(new Fibonacci(), Integer.parseInt(word[1])).execute(10));
			} else if (word[0].startsWith("d")) {
				System.out.println("divide " + Integer.parseInt(word[1]));
				System.out.println(new Entre(new Fibonacci(), Integer.parseInt(word[1])).execute(10));
			} else if (word[0].startsWith("r")) {
				System.out.println("redondea");
				System.out.println(new Redondeo(new Fibonacci()).execute(10));
			} else
				System.out.println("Comando no válido");

		} while (true);
	}
}
