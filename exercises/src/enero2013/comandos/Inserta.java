package enero2013.comandos;

import enero2013.text.Texto;

public class Inserta implements Comando {

	private String[] line;

	public Inserta(String[] line) {
		this.line = line;
	}

	@Override
	public void execute() {
		StringBuffer sb = Texto.getSb();
		for (int i = 1; i < line.length; i++)
			sb.append(line[i] + " ");
		Texto.setSb(sb);
	}

}
