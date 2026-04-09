package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	
	private static Logger logger;
	
	public Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	private List<String> mensajes = new ArrayList<>();

	
	private Logger() {}
	
	
	public void registrar(String mensaje) {
		mensajes.add(mensaje);
	}
	public void mostrarLogs() {
		mensajes.forEach(System.out::println);
	}
}
