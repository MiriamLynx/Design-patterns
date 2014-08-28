package enero2013.comandos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import enero2013.text.Texto;

public class Abre implements Comando {

	private String[] line;

	public Abre(String[] line) {
		this.line = line;
	}

	@Override
	public void execute() {
		BufferedReader br;
		StringBuffer result = new StringBuffer();
		try {
			br = new BufferedReader(new FileReader("src\\" + line[1]));
			String line;
			while ((line = br.readLine()) != null) {
				result.append(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Texto.setSb(result);
	}

}
