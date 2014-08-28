package adapter;

public class Main {

	public static void main(String[] args) {
		Motor economico = new MotorEconomico();
		Motor gaston = new MotorGaston();
		Motor electrico = new MotorElectricoAdapter();
		economico.encender();
		gaston.encender();
		electrico.encender();
	}

}
