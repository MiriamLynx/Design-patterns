package logger.logging;

public class HTMLtext implements Formatter {

	@Override
	public String format(String msg) {
		return "<li>" + msg + "</li>";
	}

	@Override
	public String heather() {
		return "<html><body><h1><ul>";
	}

	@Override
	public String footer() {
		return "</ul><h1><body></html>";
	}

}
