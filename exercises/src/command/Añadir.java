package command;

public class A�adir implements Command {

	private Informacion info;

	public A�adir(Informacion info){
		this.info = info;
	}
	
	@Override
	public void execute() {
		info.addNewElement();
	}

}
