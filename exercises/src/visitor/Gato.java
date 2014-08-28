package visitor;

public class Gato implements Visitable {

	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
}
