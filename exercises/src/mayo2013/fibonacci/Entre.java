package mayo2013.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Entre extends Aritmetica {

	private int divisor;

	public Entre(Operacion operacion, int divisor) {
		super(operacion);
		this.divisor = divisor;
	}

	@Override
	public List<Double> execute(int number) {
		List<Double> values = new ArrayList<Double>();
		for (Double d : super.execute(number)) {
			values.add(d / divisor);
		}
		return values;
	}

}
