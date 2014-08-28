package mayo.main;

import static java.util.Arrays.asList;

import java.awt.Point;
import java.util.List;

import mayo.game.Diana;
import mayo.game.Impacto;

public class Modelo {
	public static Impacto Bala1 = new Impacto(new Point(5, 10));
	public static Impacto Bala2 = new Impacto(new Point(10, 10));
	public static Impacto Bala3 = new Impacto(new Point(13, 2));

	public static Diana Diana1 = new Diana(new Point(9, 6), 10, 1);
	public static Diana Diana2 = new Diana(new Point(5, 10), 6, 2);
	public static Diana Diana3 = new Diana(new Point(6, 14), 10, 3);
	public static Diana Diana4 = new Diana(new Point(14, 15), 4, 4);
	public static List<Diana> TodasLasDianas = asList(Diana1, Diana2, Diana3,
			Diana4);

}
