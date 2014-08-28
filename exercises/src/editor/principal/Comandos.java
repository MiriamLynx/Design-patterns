package editor.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import editor.dibujo.Editor;
import editor.herramientas.HCreacionCirculo;
import editor.herramientas.HCreacionCuadrado;
import editor.herramientas.HCreacionTriangulo;
import editor.herramientas.HSeleccion;

public class Comandos {

	private Editor editor;

	public Comandos() {
		editor = new Editor();
	}

	public void execute() {
		mostrarOpcionesGenerales();
		introducirComandos();
	}

	private void mostrarOpcionesGenerales() {

		String cadena = "Herramientas: crear-cuadradado, crear-circulo, crear-triangulo, seleccion \n";
		cadena += "Comandos: pinchar x,y / soltar x,y / mover x,y \n";
		cadena += "Otros comandos: dibujar, exit";
		System.out.println(cadena);
	}

	private void introducirComandos() {

		String[] linea = leerTeclado();

		while (!linea[0].equalsIgnoreCase("exit")) {

			switch (linea[0]) {
			case ("dibujar"): {
				editor.dibujar();
				break;
			}
			case ("seleccion"): {
				editor.setHerramientaSeleccionada(new HSeleccion(editor));
				break;
			}
			case ("crear-cuadrado"): {
				editor.setHerramientaSeleccionada(new HCreacionCuadrado(editor));
				break;
			}
			case ("crear-circulo"): {
				editor.setHerramientaSeleccionada(new HCreacionCirculo(editor));
				break;
			}
			case ("crear-triangulo"): {
				editor.setHerramientaSeleccionada(new HCreacionTriangulo(editor));
				break;
			}
			case ("pinchar"): {
				if (linea.length == 3) {
					int x = Integer.parseInt(linea[1]);
					int y = Integer.parseInt(linea[2]);
					editor.pinchar(x, y);
				} else
					System.out.println("Te faltan las coordenadas");
				break;
			}
			case ("soltar"): {
				if (linea.length == 3) {
					int x = Integer.parseInt(linea[1]);
					int y = Integer.parseInt(linea[2]);
					editor.soltar(x, y);
				} else
					System.out.println("Te faltan las coordenadas");
				break;
			}
			case ("mover"): {
				if (linea.length == 3) {
					int x = Integer.parseInt(linea[1]);
					int y = Integer.parseInt(linea[2]);
					editor.mover(x, y);
				} else
					System.out.println("Te faltan las coordenadas");
				break;
			}
			default:
				System.out.println("Escribe algo decente...");
			}
			linea = leerTeclado();
		}
	}

	private String[] leerTeclado() {
		System.out.print(">");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] linea = null;
		try {
			linea = in.readLine().split("[ ,]");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Caca en la lectura");
		}
		return linea;
	}

}
