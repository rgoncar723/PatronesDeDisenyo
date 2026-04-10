package ejercicio2;

public class EmailNotificacion implements INotificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.println(mensaje);
		
	}

}
