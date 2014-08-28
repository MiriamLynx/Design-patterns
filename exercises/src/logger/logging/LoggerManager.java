package logger.logging;

import java.io.IOException;

//Este lleva el Singleton
public class LoggerManager {
	
	private static LoggerManager instance = new LoggerManager();
	
	private Logger logger;
	private static final Formatter FORMATPLAIN = new Plaintext();
	private static final Formatter FORMATHTML = new HTMLtext();
	
	private LoggerManager(){
		
	}
	
	public static LoggerManager getInstance(){
		if(instance == null)
			instance = new LoggerManager();
		return instance;
	}
	
	public void createConsoleLogger(Formatter formato){
		if(logger != null)
			throw new IllegalStateException("Falló creación ConsoleLogger");
		logger = new ConsoleLogger(formato);
	}
	
	public void createFileLogger(Formatter formato, String route){
		if(logger != null)
			throw new IllegalStateException("Falló creación FileLogger");
		try {
			logger = new FileLogger(formato, route);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Logger getLogger() {
		if(logger == null)
			logger = new ConsoleLogger(FORMATPLAIN);
		return logger;
	}

	public static Formatter getFormatplain() {
		return FORMATPLAIN;
	}

	public static Formatter getFormathtml() {
		return FORMATHTML;
	}
	
}
