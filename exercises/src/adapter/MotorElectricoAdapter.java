package adapter;

public class MotorElectricoAdapter implements Motor {
	
	private MotorElectrico motor = new MotorElectrico();

	@Override
	public void encender() {
		motor.activar();
	}

	@Override
	public void acelerar() {
		motor.moverMasRapido();
	}

	@Override
	public void apagar() {
		motor.desactivar();
	}

}
