package ejercicio3;

public class Pedido {
	private String cliente; // (Obligatorio)
	private String direccion;// (Obligatorio)
	private int telefono;// Opcional
	private String email; // Opcional
	private String observaciones; // Opcional

	private Pedido(Builder builder) {
		 	this.cliente = builder.cliente;
	        this.direccion = builder.direccion;
	        this.telefono = builder.telefono;
	        this.email = builder.email;
	        this.observaciones = builder.observaciones;
	}

	public static class Builder {
		private String cliente; // (Obligatorio)
		private String direccion;// (Obligatorio)
		private int telefono;// Opcional
		private String email; // Opcional
		private String observaciones; // Opcional

		public Builder(String cliente, String direccion) {
			this.cliente = cliente;
			this.direccion = direccion;
		}

		public Builder setTelefono(int telefono) {
			this.telefono = telefono;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setObservaciones(String observaciones) {
			this.observaciones = observaciones;
			return this;
		}

		public Pedido build() {
			return new Pedido(this);
		}
	}
	@Override 
	public String toString() {
		return String.format(" Cliente: %s\n Direccion: %s\n Telefono: %d\n Email: %s\n Observaciones: %s\n ", cliente,direccion,telefono,email,observaciones);
	}

}
