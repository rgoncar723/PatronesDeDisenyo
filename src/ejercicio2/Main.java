package ejercicio2;

import java.util.Scanner;

public class Main {
	public void show() {
		String mensaje;
		Scanner kb = new Scanner(System.in);
		NotificacionFactory factory = new NotificacionFactory();
		INotificacion n;
	
		int opcion = -1;
		do {
			System.out.printf("Escoga una opcion:\n 0.Salir\n 1. Enviar un email.\n 2.Enviar un SMS.\n 3.Enviar un Push.\n");
			System.out.println("Opcion: ");
			opcion = kb.nextInt();
			switch(opcion) {
			case 0 -> System.out.println("Saliendo...");
			case 1 -> {
				kb.nextLine();
				n = factory.crearNotificacion("email");
				System.out.println("Escriba el mensaje que desea enviar");
				mensaje = kb.nextLine();
				n.enviar(mensaje);
			}
			case 2 -> {
				kb.nextLine();
				n = factory.crearNotificacion("sms");
				System.out.println("Escriba el mensaje que desea enviar");
				mensaje = kb.nextLine();
				n.enviar(mensaje);
			}
			case 3 -> {
				kb.nextLine();
				n = factory.crearNotificacion("push");
				System.out.println("Escriba el mensaje que desea enviar");
				mensaje = kb.nextLine();
				n.enviar(mensaje);
			}
			default -> System.out.println("Opcion invalida");
			}
			
		}while(opcion != 0);
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
