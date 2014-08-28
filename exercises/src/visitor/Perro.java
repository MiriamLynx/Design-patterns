package visitor;

public class Perro implements Visitable {
	
	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
