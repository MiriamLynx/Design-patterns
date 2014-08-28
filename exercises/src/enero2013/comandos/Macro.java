package enero2013.comandos;

import java.util.ArrayList;
import java.util.List;

public class Macro implements Comando{

	List<Comando> comandos = new ArrayList<Comando>();
	private String nombre;

	public Macro(String nombre){
		this.setNombre(nombre);
	}
	
	public void store(Comando comando) {
		comandos.add(comando);
	}

	@Override
	public void execute() {
		for (Comando c : comandos) {
			c.execute();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
