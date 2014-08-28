package visitor;

public class VisitorQuitaPulgas implements Visitor {

	@Override
	public void visit(Perro perro) {
		System.out.println("Quitar pulgas de la barriga");
	}

	@Override
	public void visit(Gato gato) {
		System.out.println("Quitar pulgas de la cola");
	}

}
