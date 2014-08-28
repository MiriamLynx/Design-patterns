package logger.logging;

public class Plaintext implements Formatter {

	@Override
	public String format(String msg) {
		return heather() + msg + footer();
	}

	@Override
	public String heather() {
		return "";
	}

	@Override
	public String footer() {
		return "";
	}

}
