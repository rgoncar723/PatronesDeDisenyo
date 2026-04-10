package ejercicio2;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public void show() {
		Scanner kb = new Scanner(System.in);
		NotificacionFactory factory = new NotificacionFactory();
		INotificacion n;

		int opcion = -1;
		do {
			System.out.printf(
					"Escoga una opcion:\n 0.Salir\n 1.Enviar un email.\n 2.Enviar un SMS.\n 3.Enviar un Push.\n");
			System.out.println("Opcion: ");
			opcion = kb.nextInt();
			switch (opcion) {
			case 0 -> System.out.println("Saliendo...");
			case 1 -> {

				n = factory.crearNotificacion("email");
				n.enviar(escribirMensaje(kb));
			}
			case 2 -> {

				n = factory.crearNotificacion("sms");
				n.enviar(escribirMensaje(kb));
			}
			case 3 -> {

				n = factory.crearNotificacion("push");
				n.enviar(escribirMensaje(kb));
			}
			default -> System.out.println("Opcion invalida");
			}

		} while (opcion != 0);
	}

	String escribirMensaje(Scanner kb) {
		String mensaje;
		kb.nextLine();
		System.out.println("Escriba el mensaje que desea enviar");
		mensaje = kb.nextLine();
		return mensaje;
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
