package enero2013.comandos;

import enero2013.text.Texto;

public class Borra implements Comando {

	private String[] line;

	public Borra(String[] line) {
		this.setLine(line);
	}

	@Override
	public void execute() {
		StringBuffer sb = Texto.getSb();
		int ultimo = Texto.getSb().toString().trim().lastIndexOf(" ");
		if (ultimo == -1)
			Texto.setSb(new StringBuffer(""));
		else
			sb.setLength(ultimo + 1);
		Texto.setSb(sb);
	}

	public String[] getLine() {
		return line;
	}

	public void setLine(String[] line) {
		this.line = line;
	}

}
