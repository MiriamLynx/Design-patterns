package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	
	private List<Observador> observadores = new ArrayList<Observador>();
	
	public void agregarObservador(Observador o){
		observadores.add(o);
	}
	
	public void eliminarObservador(Observador o){
		observadores.remove(o);
	}
	
	public void notificar(){
		for(Observador obv : observadores){
			obv.update();
		}
	}
	
}
