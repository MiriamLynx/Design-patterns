package command;

public class Actualizar implements Command {

	private Informacion info;

	public Actualizar(Informacion info) {
		this.info = info;
	}

	@Override
	public void execute() {
		info.updateElement();
	}

}
