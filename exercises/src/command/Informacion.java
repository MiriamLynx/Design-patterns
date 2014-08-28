package command;

public class Informacion {
	
	public int contador = 0;

	public void addNewElement() {
		contador += 1;
		System.out.println("Contador " + contador);
	}

	public void deleteElement() {
		System.out.println("Informacion borro elemento");
	}

	public void updateElement() {
		System.out.println("Informacion actualizo elemento");
	}

}
