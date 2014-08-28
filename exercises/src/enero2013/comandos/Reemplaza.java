package enero2013.comandos;

import java.util.regex.Pattern;

import enero2013.text.Texto;

public class Reemplaza implements Comando {

	private String[] line;

	public Reemplaza(String[] line) {
		this.line = line;
	}

	@Override
	public void execute() {
		StringBuffer sb = Texto.getSb();
		Texto.setSb(new StringBuffer(sb.toString().replaceAll(
				Pattern.quote(line[1]), line[2])));
	}

}
