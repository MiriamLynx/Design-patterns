package interprete.util;

public class Estado {
	
	private int ip;

	private int[] memoria;
	
	private int[] pila;
	private int sp;
	
	public Estado(){
		ip = 0;
		memoria = new int[1024];
		pila = new int[32];
		sp = 0;
	}
	
	public void push(int valor) {
		pila[sp] = valor;
		sp++;
	}

	public int pop() {
		sp--;
		return pila[sp];
	}
	
	public void incrementarIp(){
		ip++;
	}
	
	public void setIp(int newIp){
		ip = newIp;
	}
	
	public int getIp() {
		return ip;
	}
	
	public void setMemoria(int direccion, int valor){
		memoria[direccion] = valor;
	}
	
	public int getMemoria(int direccion){
		return memoria[direccion];
	}

}
