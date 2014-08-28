package logger.logging;

public abstract class AbstractLogger implements Logger {

	public Formatter formato;
	
	public AbstractLogger(Formatter formato) {
		this.formato = formato;
		formato.heather();
	}

}
