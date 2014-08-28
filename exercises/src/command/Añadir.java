package command;

public class Añadir implements Command {

	private Informacion info;

	public Añadir(Informacion info){
		this.info = info;
	}
	
	@Override
	public void execute() {
		info.addNewElement();
	}

}
