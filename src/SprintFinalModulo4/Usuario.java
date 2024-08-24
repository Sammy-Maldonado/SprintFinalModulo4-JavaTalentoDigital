package SprintFinalModulo4;

public class Usuario implements Asesoria {

	private String nombres;
	private String fechaNacimiento;
	private int run;

	// constructor vacio
	public Usuario() {
	}
	
	// constructor con atributos
	public Usuario(String nombres, String fechaNacimiento, int run) {
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	// toString
			@Override
			public String toString() {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("   Datos del Usuario   ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
				return "Nombres: " + nombres + "\n" + 
					   "Fecha de Nacimiento: " + fechaNacimiento + "\n" + 
					   "Run: " + run;
			}

	// metodo de interfaz
	@Override
	public void analizarUsuario() {
		System.out.println("Nombres: " + nombres);
		System.out.println("Run: " + run);
	}

	// Método mostrarEdad()
	public void mostrarEdad(int edad) {
		// Imprimir la edad actual
		System.out.println("La edad actual del usuario es: " + edad + " años.");
	}
	
	
}
