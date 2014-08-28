package command;

public class Borrar implements Command {

	private Informacion info;

	public Borrar(Informacion info){
		this.info = info;
	}
	
	@Override
	public void execute() {
		info.deleteElement();
	}

}
