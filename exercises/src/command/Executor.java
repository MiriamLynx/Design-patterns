package command;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	private List<Command> commands = new ArrayList<Command>();

	public void store(Command command) {
		commands.add(command);
	}

	public void run() {
		commands.get(commands.size()).execute();
	}

}
