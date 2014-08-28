package templateMethod;

public abstract class Automovil {
	
	public void desplazar(){
		System.out.println("Run run");
	}
	
	public void acelerar(){
		cambiarMarcha();
		System.out.println("Niooo");
	}
	
	public void frenar(){
		cambiarMarcha();
		System.out.println("Ñiiii");
	}
	
	abstract void cambiarMarcha();

}
