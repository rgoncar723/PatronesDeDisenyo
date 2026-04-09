package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	private List<String> mensajes;
	private static Logger logger;
	
	private Logger() {}
	
	public Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
			
}
