package adapter;

public class MotorGaston implements Motor{
	
	@Override
	public void encender() {
		System.out.println("Encendiendo motor gaston");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor gaston");
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor gaston");
	}

}
