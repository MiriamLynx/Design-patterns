package logger.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends AbstractLogger {

	private String archiveRoute;
	
	private BufferedWriter output;
	
	FileLogger(Formatter formato, String route) throws IOException{
		super(formato);
		this.archiveRoute = route;
		output = new BufferedWriter(new FileWriter(archiveRoute));
	}
	
	@Override
	public String log(String msg) {
		String cadena = formato.format(msg);
		try {
			output.write(cadena);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo al escribir la cadena en fichero");
			e.printStackTrace();
		}
		return cadena;
	}

	@Override
	public String close(){
		String cadena = formato.footer();
		try {
			output.write(cadena);
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fallo al close de FileLogger");
		}
		return cadena;
	}
	
	
	
	

}
