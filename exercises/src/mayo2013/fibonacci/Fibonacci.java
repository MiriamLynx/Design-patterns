package mayo2013.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci extends Operacion {

	@Override
	public List<Double> execute(int number) {
		List<Double> values = new ArrayList<Double>();
		double antepenultimo = 0;
		double penultimo = 1;
		double ultimo;
		for (int i = 2; i < number; i++) {
			ultimo = antepenultimo + penultimo;
			values.add(ultimo);
			antepenultimo = penultimo;
			penultimo = ultimo;
		}
		return values;
	}

}
