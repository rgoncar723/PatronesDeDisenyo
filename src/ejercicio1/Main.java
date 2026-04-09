package ejercicio1;

public class Main {
	public void show() {
		ServicioUsuarios su1 = new ServicioUsuarios();
		ServiciosPedidos sp1 = new ServiciosPedidos();
		su1.registrar("[INFO] Usuario creado");
		su1.registrar("[INFO] Usuario eliminado");
		sp1.registrar("[INFO] Pedido creado");
		sp1.registrar("[INFO] Pedido eliminado");
		Logger.getLogger().mostrarLogs();
		
		
		
	}

	public static void main(String[] args) {
		new Main().show();

	}

}
