package logger.principal;

import logger.logging.Formatter;
import logger.logging.HTMLtext;
import logger.logging.LoggerManager;
import logger.logging.Plaintext;

public class StartPoint {

	private static final Formatter FORMATPLAIN = new Plaintext();
	private static final Formatter FORMATHTML = new HTMLtext();

	public static void main(String[] args) {

		LoggerManager logger = LoggerManager.getInstance();
		logger.createFileLogger(FORMATPLAIN, "src/txt/out.txt");
		logger.getLogger().log("Cuack");
		logger.getLogger().close();

	}

	public static Formatter getFormathtml() {
		return FORMATHTML;
	}

	public static Formatter getFormatplain() {
		return FORMATPLAIN;
	}

}
