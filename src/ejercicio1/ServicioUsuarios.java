package ejercicio1;

public class ServicioUsuarios {
	private Logger logger;

	public ServicioUsuarios() {
		logger = logger.getLogger();
	}
	public void registrar(String mensaje) {
		logger.registrar(mensaje);
	}
}


