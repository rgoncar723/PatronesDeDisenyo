package ejercicio3;

public class Main {
	public void show() {
		Pedido pb = new Pedido.Builder("Pepe", "Calle Santa Maria").build();
		Pedido pc = new Pedido.Builder("Diego", "Calle 10").setTelefono(610101101).setEmail("Diego@gmail.com").setObservaciones("Todo de 10").build();
		System.out.println("Pedido básico");
		System.out.println(pb.toString());

		System.out.println("Pedido completo");
		System.out.println(pc.toString());

	}

	public static void main(String[] args) {
		new Main().show();

	}

}
