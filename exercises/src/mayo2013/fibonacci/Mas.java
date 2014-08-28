package mayo2013.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Mas extends Aritmetica {

	private int sumando;

	public Mas(Operacion operacion, int sumando) {
		super(operacion);
		this.sumando = sumando;
	}

	@Override
	public List<Double> execute(int number) {
		List<Double> values = new ArrayList<Double>();
		for (Double d : super.execute(number)) {
			values.add(d + sumando);
		}
		return values;
	}

}
