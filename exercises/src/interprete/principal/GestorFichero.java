package interprete.principal;

import interprete.instrucciones.AddInstruct;
import interprete.instrucciones.InputInstruct;
import interprete.instrucciones.InstruccionInterface;
import interprete.instrucciones.JmpInstruct;
import interprete.instrucciones.JmpgInstruct;
import interprete.instrucciones.LoadInstruct;
import interprete.instrucciones.MulInstruct;
import interprete.instrucciones.OutputInstruct;
import interprete.instrucciones.PushInstruct;
import interprete.instrucciones.StoreInstruct;
import interprete.instrucciones.SubInstruct;
import interprete.util.Estado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorFichero {

	private List<String[]> instrucciones;

	private Estado estadoActual;

	public GestorFichero() {
		instrucciones = new ArrayList<String[]>();
		estadoActual = new Estado();
	}

	public void ejecucion() {
		try {
			leerFichero();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error de fichero");
		}

		ejecutaPrograma();
	}

	private void leerFichero() throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader(
				"file/factorial.txt"));

		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstrucción(linea);
		fichero.close();
	}

	private void ejecutaPrograma() {

		while (estadoActual.getIp() < instrucciones.size()) {
			String[] instruccion = instrucciones.get(estadoActual.getIp());

			if (instruccion[0].equals("push")) {
				InstruccionInterface inst = new PushInstruct(instruccion[1]);
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("add")) {
				InstruccionInterface inst = new AddInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("sub")) {
				InstruccionInterface inst = new SubInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("mul")) {
				InstruccionInterface inst = new MulInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("jmp")) {
				InstruccionInterface inst = new JmpInstruct(instruccion[1]);
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("jmpg")) {
				InstruccionInterface inst = new JmpgInstruct(instruccion[1]);
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("load")) {
				InstruccionInterface inst = new LoadInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("store")) {
				InstruccionInterface inst = new StoreInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("input")) {
				InstruccionInterface inst = new InputInstruct();
				estadoActual = inst.accion(estadoActual);
			} else if (instruccion[0].equals("output")) {
				InstruccionInterface inst = new OutputInstruct();
				estadoActual = inst.accion(estadoActual);
			}
		}
	}

	private static final boolean TRACE = false;

	private void cargaInstrucción(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		if (TRACE) {
			for (String word : palabras)
				System.out.println("*" + word + "*");
		}
		instrucciones.add(palabras);
	}

}
