package SprintFinalModulo4;

import java.util.ArrayList;
import java.util.Iterator;

public class Contenedor {

	private ArrayList<Asesoria> asesorias;
	private ArrayList<Capacitacion> capacitaciones;

	public Contenedor() {
		asesorias = new ArrayList<>();
		capacitaciones = new ArrayList<>();
	}

	// Método para almacenar un cliente en la lista de Asesoria
	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}

	// Método para almacenar un profesional en la lista de Asesoria
	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}

	// Método para almacenar un administrativo en la lista de Asesoria
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}

	// Método para almacenar una capacitación en la lista de Capacitacion
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	// Método para eliminar un usuario de la lista de Asesoria según el RUN
	public void eliminarUsuario(int run) {
		Iterator<Asesoria> iterator = asesorias.iterator();
		while (iterator.hasNext()) {
			Asesoria asesoria = iterator.next();
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				if (usuario.getRun() == run) {
					iterator.remove();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ Buscando run ~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("El usuario con run: " + run + " se ha eliminado correctamente ");
					return;
				}
			}
		}
		System.out.println("No se encontró ningún usuario con el RUN: " + run);
	}

	// Método para listar todos los usuarios (datos de la clase Usuario)
	public void listarUsuarios() {
		for (Asesoria asesoria : asesorias) {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				System.out.println(usuario);
			}
		}
	}

	// Método para listar usuarios por tipo (cliente, administrador o profesional)
	public void listarUsuariosPorTipo(String tipo) {
		for (Asesoria asesoria : asesorias) {
			// si es cliente
			if (asesoria instanceof Cliente && tipo.equalsIgnoreCase("cliente")) {
				Cliente cliente = (Cliente) asesoria;
				System.out.println(cliente);
				// si es Administrativo
			} else if (asesoria instanceof Administrativo && tipo.equalsIgnoreCase("administrativo")) {
				Administrativo administrativo = (Administrativo) asesoria;
				System.out.println(administrativo);
				// si es Profesional
			} else if (asesoria instanceof Profesional && tipo.equalsIgnoreCase("profesional")) {
				Profesional profesional = (Profesional) asesoria;
				System.out.println(profesional);
			}
		}
	}

	// Método para listar todas las capacitaciones con los datos del cliente
	// asociado
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion);
			for (Asesoria asesoria : asesorias) {
				if (asesoria instanceof Cliente) {
					Cliente cliente = (Cliente) asesoria;
					if (cliente.getRun() == capacitacion.getRutCliente()) {
						System.out.println("Cliente asociado: " + cliente.getNombres());
						break;
					}
				}
			}
		}
	}
}
