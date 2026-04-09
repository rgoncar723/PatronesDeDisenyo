package ejercicio1;

public class ServiciosPedidos {
	private Logger logger;
	
	public ServiciosPedidos() {
		logger = logger.getLogger();
	}
	public void registrar(String mensaje) {
		logger.registrar(mensaje);
	}


}
