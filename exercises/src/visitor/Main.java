package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Visitable> lista = new ArrayList<Visitable>();
		lista.add(new Perro());
		lista.add(new Gato());
		Visitor comida = new VisitorDeComida();
		Visitor pulgas = new VisitorQuitaPulgas();
		for(Visitable v : lista){
			v.accept(comida);
			v.accept(pulgas);
		}
	}

}
