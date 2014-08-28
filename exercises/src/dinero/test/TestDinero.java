package dinero.test;

import dinero.composite.Dinero;
import dinero.composite.DineroSimple;

public class TestDinero {

	static Dinero m12EUR, m14EUR, m5CHF, m20USD; // cantidades "simples"
	static Dinero cantidad1, cantidad2;

	public static void setUpBeforeClass() throws Exception {

		m12EUR = new DineroSimple(12, "EUR");
		m14EUR = new DineroSimple(14, "EUR");
		m5CHF = new DineroSimple(5, "CHF");
		m20USD = new DineroSimple(20, "USD");
	}

	public static void main(String[] args) throws Exception {
		
		setUpBeforeClass();

		cantidad1 = m12EUR.sumar(m14EUR); // 26 EUR
		assertEquals("26.0 EUR", cantidad1.toString());

		cantidad2 = cantidad1.sumar(m5CHF); // [26 EUR, 5 CHF]
		assertEquals("[26.0 EUR, 5.0 CHF, ]", cantidad2.toString());

		// 3.dinero compuesto + dinero simple
		cantidad1 = cantidad2.sumar(m20USD); // [26 EUR, 5 CHF, 20 USD]
		assertEquals("[26.0 EUR, 5.0 CHF, 20.0 USD, ]", cantidad1.toString());
		
		// 4.dinero compuesto + dinero compuesto
		cantidad1 = cantidad1.sumar(cantidad2); // [52 EUR, 10 CHF, 20 USD]
		assertEquals("[52.0 EUR, 10.0 CHF, 20.0 USD, ]", cantidad1.toString());
	}

	public static void assertEquals(String uno, String dos) {
		if (uno.equals(dos)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Error");
		}
	}

}
