package SprintFinalModulo4;

public class Profesional extends Usuario {

	private String titulo;
	private String fechaIngreso;

	public Profesional() {
	}

	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	// otros metodos analizarUsuario()
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: " + titulo + "\n" + 
						   "FechaIngreso: " + fechaIngreso);
	}
	
	@Override
	public String toString() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Datos del Profesional ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		super.analizarUsuario();
		return "titulo: " + titulo + "\n" + 
			   "fecha de Ingreso: " + fechaIngreso;
	}
}