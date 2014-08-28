package logger.logging;

public class ConsoleLogger extends AbstractLogger{
	
	ConsoleLogger(Formatter formato){
		super(formato);
	}
	
	@Override
	public String log(String msg){
		String cadena = formato.format(msg);
		System.out.println(cadena);
		return cadena;
	}

	@Override
	public String close() {
		String cadena = formato.footer();
		System.out.println(cadena);
		return cadena;
	}
}
