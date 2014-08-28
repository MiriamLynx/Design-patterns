package mayo2013.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Redondeo extends Aritmetica {
	

	public Redondeo(Operacion operacion) {
		super(operacion);
	}

	@Override
	public List<Double> execute(int number) {
		List<Double> values = new ArrayList<Double>();
		for (Double d : super.execute(number)) {
			values.add(Math.floor(d));
		}
		return values;
	}


}
