package dinero.composite;

public class DineroSimple implements Dinero {

	private double valor;
	
	private String divisa;
	
	public DineroSimple(double valor, String divisa){
		this.valor = valor;
		this.divisa = divisa;
	}
	
	public String getDivisa(){
		return divisa;
	}
	
	public double getValor(){
		return valor;
	}
	
	@Override
	public Dinero sumar(Dinero din){
		
		if(din instanceof DineroSimple){
			return sumarDineroSimple((DineroSimple) din);
		}
		else{
			return sumarDineroCompuesto((DineroCompuesto) din);
		}
	}

	private Dinero sumarDineroSimple(DineroSimple din) {
		
		if(this.getDivisa().equals(din.getDivisa()))
			return new DineroSimple(getValor() + din.getValor(), getDivisa());
		else{
			DineroCompuesto dinCom = new DineroCompuesto();
			dinCom = (DineroCompuesto) dinCom.sumar(this);
			dinCom = (DineroCompuesto) dinCom.sumar(din);
			return dinCom;
		}
	}

	private Dinero sumarDineroCompuesto(DineroCompuesto din) {
		
		DineroCompuesto dinCom = new DineroCompuesto();
		dinCom = (DineroCompuesto) dinCom.sumar(this);
		dinCom = (DineroCompuesto) dinCom.sumar(din);
		return dinCom;
	}
	
	@Override
	public String toString(){
		String cadena = this.getValor() + " " + this.getDivisa();
		return cadena;
	}
}
