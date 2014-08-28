package mayo.main;

import static java.util.Arrays.asList;
import static mayo.main.Modelo.Bala1;
import static mayo.main.Modelo.Bala2;
import static mayo.main.Modelo.Bala3;
import static mayo.main.Modelo.Diana1;
import static mayo.main.Modelo.Diana2;
import static mayo.main.Modelo.Diana3;
import static mayo.main.Modelo.TodasLasDianas;

import java.util.ArrayList;
import java.util.List;

import mayo.bloqueo.Grosor;
import mayo.bloqueo.Macizo;
import mayo.deteccion.Centro;
import mayo.deteccion.Circulo;
import mayo.deteccion.Cuadrado;
import mayo.game.Diana;
import mayo.game.Game;

public class Main {

	private static List<Diana> LISTA_VACIA = new ArrayList<Diana>();;

	public static void main(String[] args) {

		pantalla1();
		pantalla2();
		pantalla3();
		pantalla4();
		pantalla5();
		pantalla6();
		pantalla7();
		pantalla8();
	}

	private static void CheckImpactadas(List<Diana> impactadas,
			List<Diana> esperadas, int pantalla) {
		if (impactadas.size() != esperadas.size()
				|| impactadas.retainAll(esperadas)) {
			System.out
					.println("---> ERROR: El resultado no es el esperado!!!!");
		} else {
			System.out.println("---> Resultado correcto en pantalla" + pantalla
					+ "!!");
		}
	}

	/**
	 * Con circulo sin bloqueo
	 */
	public static void pantalla1() {
		Game game = new Game(new Circulo());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana2, Diana3), 1);

		impactadas = game.getDianasImpactadas(Bala2);
		CheckImpactadas(impactadas, asList(Diana1), 1);

		impactadas = game.getDianasImpactadas(Bala3);
		CheckImpactadas(impactadas, LISTA_VACIA, 1);
	}

	/**
	 * Con cuadrado sin bloqueo
	 */
	public static void pantalla2() {
		Game game = new Game(new Cuadrado());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana1, Diana2, Diana3), 2);

		impactadas = game.getDianasImpactadas(Bala2);
		CheckImpactadas(impactadas, asList(Diana1, Diana3), 2);

		impactadas = game.getDianasImpactadas(Bala3);
		CheckImpactadas(impactadas, asList(Diana1), 2);

	}

	/**
	 * Con centro sin bloqueo
	 */
	public static void pantalla3() {
		Game game = new Game(new Centro());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana2), 3);

		impactadas = game.getDianasImpactadas(Bala2);
		CheckImpactadas(impactadas, LISTA_VACIA, 3);

		impactadas = game.getDianasImpactadas(Bala3);
		CheckImpactadas(impactadas, LISTA_VACIA, 3);

	}

	/**
	 * Con circulo macizo
	 */
	public static void pantalla4() {
		Game game = new Game(new Circulo(), new Macizo());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana2), 4);

	}

	/**
	 * Con cuadrado macizo
	 */
	public static void pantalla5() {
		Game game = new Game(new Cuadrado(), new Macizo());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana1), 5);

	}

	/**
	 * Con cuadrado grosor 3
	 */
	public static void pantalla6() {
		Game game = new Game(new Cuadrado(), new Grosor(3));
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala2);
		CheckImpactadas(impactadas, asList(Diana1, Diana3), 6);

	}

	/**
	 * Con circulo grosor 2
	 */
	public static void pantalla7() {
		Game game = new Game(new Circulo(), new Grosor(2));
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala2);
		CheckImpactadas(impactadas, asList(Diana1), 7);

	}

	/**
	 * Con centro sin bloqueo
	 */
	public static void pantalla8() {
		Game game = new Game(new Centro());
		game.add(TodasLasDianas);

		List<Diana> impactadas = game.getDianasImpactadas(Bala1);
		CheckImpactadas(impactadas, asList(Diana2), 8);

	}

}
