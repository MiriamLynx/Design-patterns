package enero2013.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import enero2013.comandos.Abre;
import enero2013.comandos.Borra;
import enero2013.comandos.Comando;
import enero2013.comandos.Inserta;
import enero2013.comandos.Macro;
import enero2013.comandos.Reemplaza;
import enero2013.text.Texto;

public class Main {

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		texto = new StringBuffer("");

		System.out.println("Comandos:");
		System.out.println("abre <fichero>");
		System.out
				.println("inserta <texto>\t// inserta las palabras al final del texto");
		System.out.println("borra\t\t// Borra la última palabra");
		System.out
				.println("reemplaza <a> <b>\t// reemplaza la cadena <a> por la <b> en todo el texto");
		System.out.println("\nTareas:");
		System.out
				.println("record <macro>\t// comienza la grabación de una macro");
		System.out.println("stop\t\t// finaliza la grabación");
		System.out
				.println("play <macro>\t// ejecuta la macro cuyo nombre se indique");

		do {
			System.out.print(">");

			String[] line = in.readLine().split(" ");

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("abre")) {
				run(new Abre(line));
			} else if (line[0].startsWith("ins")) {
				run(new Inserta(line));
			} else if (line[0].startsWith("borr")) {
				run(new Borra(line));
			} else if (line[0].startsWith("reem")) {
				run(new Reemplaza(line));
			} else if (line[0].startsWith("rec")) {
				macro = new Macro(line[1]);
				grabando = true;
			} else if (line[0].startsWith("stop")) {
				macros.put(macro.getNombre(), macro);
				grabando = false;
			} else if (line[0].startsWith("play")) {
				run(macros.get(line[1]));
			} else
				System.out.println("Comando no válido");

			System.out.println(texto);
		} while (true);

	}
	
	private static void run(Comando comando){
		store(comando);
		comando.execute();
		texto = Texto.getSb();
	}

	private static void store(Comando comando) {
		if (grabando) {
			macro.store(comando);
		}
	}

	private static BufferedReader in;
	private static StringBuffer texto;
	private static Macro macro;
	private static boolean grabando;
	private static HashMap<String, Macro> macros = new HashMap<String, Macro>();

}
