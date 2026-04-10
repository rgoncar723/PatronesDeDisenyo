package ejercicio2;

public class NotificacionFactory {
	public INotificacion crearNotificacion(String tipo) {
		if(tipo.equalsIgnoreCase(TipoMensaje.EMAIL.name())) {
			return new EmailNotificacion();
		}if (tipo.equalsIgnoreCase(TipoMensaje.PUSH.name())) {
			return new PushNotificacion();
		} 
		return new SmsNotificacion();
	}
}
