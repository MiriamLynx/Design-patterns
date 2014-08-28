package mayo2013.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Por extends Aritmetica {

	private int factor;

	public Por(Operacion operacion, int factor) {
		super(operacion);
		this.factor = factor;
	}

	@Override
	public List<Double> execute(int number) {
		List<Double> values = new ArrayList<Double>();
		for (Double d : super.execute(number)) {
			values.add(d * factor);
		}
		return values;
	}

}
