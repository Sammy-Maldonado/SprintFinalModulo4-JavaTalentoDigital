package SprintFinalModulo4;

public class Cliente extends Usuario {

	private String apellidos;
	private int telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	// constructor vacio
	public Cliente() {
	}

	// constructor con atributos
	public Cliente(String nombre, String fechaNacimiento, int run, String apellidos, int telefono, String afp,
			int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// metodo obtenerSistemaSalud()
	public String obtenerSistemaSalud() {
	    if (sistemaSalud == 1) {
	        return "Sistema de salud: Fonasa";
	    } else if (sistemaSalud == 2) {
	        return "Sistema de salud: Isapre";
	    } else {
	        return "Sistema de salud desconocido";
	    }
	}
	
	// metodo obtenerNombre
		public String obtenerNombre() {
			return "Nombre completo: " + getNombres() + " " + apellidos;
		}

		// analizarUsuario() de la interfaz Asesoria
		@Override
		public void analizarUsuario() {
			super.analizarUsuario();
			System.out.println("Dirección: " + direccion + "\n" + "Comuna: " + comuna);
		}
	
	
	@Override
	public String toString() {
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Datos del Cliente");
		System.out.println("~~~~~~~~~~~~~~~~~");
		super.analizarUsuario();
		return obtenerNombre() + "\n" + 
			   "Edad: " + this.edad + "\n" + 
			   "Telefono: " + telefono + "\n" + 
			   "Afp: " + afp + "\n" + 
			   obtenerSistemaSalud() + "\n" + 
			   "Direccion: " + direccion + "\n" + 
			   "Comuna: " + comuna;
	}
}