package visitor;

public class VisitorDeComida implements Visitor {

	@Override
	public void visit(Perro perro) {
		System.out.println("Dar de comer pienso de perro");
	}

	@Override
	public void visit(Gato gato) {
		System.out.println("Dar de comer pienso de gato");
	}

}
