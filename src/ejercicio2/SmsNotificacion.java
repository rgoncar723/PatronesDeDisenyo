package ejercicio2;

public class SmsNotificacion implements INotificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.println(mensaje);
		
	}

}
