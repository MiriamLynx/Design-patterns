package dinero.composite;

import java.util.ArrayList;
import java.util.List;

public class DineroCompuesto implements Dinero {

	private List<DineroSimple> montones;
	
	public DineroCompuesto(){
		montones = new ArrayList<DineroSimple>();
	}
	
	@Override
	public Dinero sumar(Dinero din) {
		
		if(din instanceof DineroSimple){
			return sumarSimple((DineroSimple) din);
		}
		else{
			return sumarCompuesto((DineroCompuesto) din);
		}
	}

	private DineroCompuesto sumarSimple(DineroSimple din) {
		
		DineroCompuesto dinCom = new DineroCompuesto();
		dinCom.montones = añadirAntiguos();
		
		for(DineroSimple monton : dinCom.montones){
			if(monton.getDivisa().equals(din.getDivisa())){
				monton = new DineroSimple(monton.getValor() + din.getValor(), monton.getDivisa());
				return dinCom;
			}
		}
		dinCom.montones.add(new DineroSimple(din.getValor(), din.getDivisa()));
		return dinCom;
	}
	
	private List<DineroSimple> añadirAntiguos(){
		
		List<DineroSimple> newMontones = new ArrayList<DineroSimple>();
		
		for(DineroSimple monton : this.montones){
			newMontones.add(monton);
		}
		return newMontones;
	}

	private Dinero sumarCompuesto(DineroCompuesto din) {
		DineroCompuesto dinCom = new DineroCompuesto();
		dinCom.montones = combinarCompuestos(din);
		return dinCom;
	}

	private List<DineroSimple> combinarCompuestos(DineroCompuesto din) {
		
		List<DineroSimple> newMontones = añadirAntiguos();
		
		for(DineroSimple dinero : din.montones){
			DineroSimple monton = repite(dinero);
			if(repite(dinero) != null){
				newMontones.set(newMontones.indexOf(monton), 
						new DineroSimple(monton.getValor() + 
								dinero.getValor(), monton.getDivisa()));
			}
			else{
				newMontones.add(dinero);
			}
		}
		return newMontones;
	}

	private DineroSimple repite(DineroSimple dinero) {
		
		for(DineroSimple monton : montones){
			if(monton.getDivisa().equals(dinero.getDivisa()))
				return monton;
		}
		return null;
	}
	
	@Override
	public String toString(){
		String cadena = "[";
		for(DineroSimple monton : this.montones){
			cadena += monton.toString() + ", ";
		}
		cadena += "]";
		return cadena;
	}
}
