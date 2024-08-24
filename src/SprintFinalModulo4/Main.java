package SprintFinalModulo4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	private static Contenedor contenedor;
	private static Scanner scanner;

	public Main() {
		contenedor = new Contenedor();
		scanner = new Scanner(System.in);
	}

	public void mostrarMenu() {
		int opcion = 0;

		while (opcion != 9) {
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°° MENÚ PRINCIPAL °°°°°°°°°°°°");
			System.out.println("°     Por favor digite una opcion     °");
			System.out.println("°        1. Almacenar cliente         °");
			System.out.println("°       2. Almacenar profesional      °");
			System.out.println("°    3. Almacenar administrativo      °");
			System.out.println("°     4. Almacenar capacitación       °");
			System.out.println("°        5. Eliminar usuario          °");
			System.out.println("°         6. Listar usuarios          °");
			System.out.println("°    7. Listar usuarios por tipo      °");
			System.out.println("°     8. Listar capacitaciones        °");
			System.out.println("°            9. Salir                 °");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				almacenarCliente();
				break;
			case 2:
				almacenarProfesional();
				break;
			case 3:
				almacenarAdministrativo();
				break;
			case 4:
				almacenarCapacitacion();
				break;
			case 5:
				eliminarUsuario();
				break;
			case 6:
				listarUsuarios();
				break;
			case 7:
				listarUsuariosPorTipo();
				break;
			case 8:
				listarCapacitaciones();
				break;
			case 9:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción incorrecta. Por favor, ingrese una opción válida.");
				break;
			}
		}
	}

	public static void almacenarCliente() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~ ALMACENAR CLIENTE ~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String nombres, apellidos, afp, direccion, comuna, fechaNacimiento;
		int run, telefono = 0, sistemaSalud, edad;

		// creamos condiciones para asegurar que se cumplan nuestras restricciones.
		// corresponde a un número menor a 99.999.999
		do {
			System.out.println("Ingrese el RUN del cliente: ");
			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, ingrese un número:");
				scanner.nextLine();
			}
			run = scanner.nextInt();
			scanner.nextLine();

			if (run >= 999999999 || run <= 0) {
				System.out.print("El RUN debe ser un número menor a 99.999.999.");
			}
		} while (run >= 999999999 || run <= 0);

		// nombre: obligatorio, mínimo 10 caracteres, máximo 50
		do {
			System.out.print("Ingrese los nombres del cliente: ");
			nombres = scanner.nextLine();
			if (nombres.length() < 10 || nombres.length() > 50) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (nombres.isEmpty() || nombres.length() < 10 || nombres.length() > 50);

		// Apellidos: obligatorio, mínimo 5 caracteres, máximo 30

		do {
			System.out.print("Ingrese los apellidos del cliente: ");
			apellidos = scanner.nextLine();
			if (apellidos.length() < 10 || apellidos.length() > 30) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 30 caracteres. ");
			}
		} while (apellidos.isEmpty() || apellidos.length() < 10 || apellidos.length() > 30);

		// Teléfono: obligatorio
		do {
			System.out.println("Ingrese su teléfono:");
			if (!scanner.hasNextInt()) {
				System.out.println("El teléfono es obligatorio");
				scanner.nextLine();
			}
			telefono = scanner.nextInt();
			scanner.nextLine();
		} while (telefono == 0);

		// AFP: mínimo 3 caracteres, máximo 30
		do {
			System.out.print("Ingrese la AFP del cliente: ");
			afp = scanner.nextLine();
			if (afp.length() < 3 || afp.length() > 30) {
				System.out.print("Debe tener mínimo 4 caracteres y máximo 30 caracteres ");
			}
		} while (afp.isEmpty() || afp.length() < 3 || afp.length() > 30);

		// Sistema de salud: 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos
		do {
			System.out.print("Ingrese el sistema de salud del cliente (1 - Fonasa, 2 - Isapre): ");
			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, ingrese un número:");
				scanner.nextLine();
			}
			sistemaSalud = scanner.nextInt();
			scanner.nextLine();

			if (sistemaSalud < 1 || sistemaSalud > 2) {
				System.out.print("Ingrese una de las opciones");
			}
		} while (sistemaSalud < 1 || sistemaSalud > 2);

		// Dirección: máximo 70 caracteres
		do {
			System.out.print("Ingrese la dirección del cliente: ");
			direccion = scanner.nextLine();
			if (direccion.length() > 70) {
				System.out.print("Excede el numero de caracteres,debe tener máximo 70 caracteres ");
			}
		} while (direccion.isEmpty() || direccion.length() > 70);

		// Comuna: máximo 50 caracteres
		do {
			System.out.print("Ingrese la comuna del cliente: ");
			comuna = scanner.nextLine();
			if (comuna.length() > 50) {
				System.out.print("Excede el numero de caracteres,debe tener máximo 50 caracteres ");
			}
		} while (comuna.isEmpty() || comuna.length() > 50);

		// Edad: obligatorio, número mayor o igual a cero, y menor a 150

		do {
			System.out.println("Ingrese la fecha de nacimiento: (dd/MM/yyyy)");
			fechaNacimiento = scanner.nextLine();
			if (fechaNacimiento.length() != 10) {
				System.out.println("El formato de fecha es incorrecto. Debe ser (dd/MM/yyyy). ");
			}
		} while (fechaNacimiento.length() != 10);

		// Convirtiendo la fecha de nacimiento en un objeto localDate para edad.

		LocalDate fechaNacimientoObj = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		// Calcular edad actual
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimientoObj, fechaActual);
		edad = periodo.getYears();

		Cliente cliente = new Cliente(nombres, fechaNacimiento, run, apellidos, telefono, afp, sistemaSalud, direccion,
				comuna, edad);
		contenedor.almacenarCliente(cliente);
		System.out.println("Cliente almacenado correctamente...");
	}

	public static void almacenarProfesional() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~ ALMACENAR PROFESIONAL ~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String nombres, fechaNacimiento, titulo, fechaIngreso;
		int run;

		// creamos condiciones para asegurar que se cumplan nuestras restricciones.
		// corresponde a un número menor a 99.999.999

		do {
			System.out.println("Ingrese el RUN del profesional: ");
			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, ingrese un número:");
				scanner.nextLine();
			}
			run = scanner.nextInt();
			scanner.nextLine();

			if (run >= 999999999 || run <= 0) {
				System.out.print("El RUN debe ser un número menor a 99.999.999.");
			}
		} while (run >= 999999999 || run <= 0);

		// nombre: obligatorio, mínimo 10 caracteres, máximo 50
		do {
			System.out.print("Ingrese los nombres del profesional: ");
			nombres = scanner.nextLine();
			if (nombres.length() < 10 || nombres.length() > 50) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (nombres.isEmpty() || nombres.length() < 10 || nombres.length() > 50);

		/*
		 * Fecha de nacimiento: obligatorio, independiente si lo declara como una fecha
		 * o string, debe ser desplegado con el formato DD/MM/AAAA
		 */

		do {
			System.out.println("Ingrese la fecha de nacimiento: (dd/MM/yyyy)");
			fechaNacimiento = scanner.nextLine();
			if (fechaNacimiento.length() != 10) {
				System.out.println("El formato de fecha es incorrecto. Debe ser (dd/MM/yyyy). ");
			}
		} while (fechaNacimiento.length() != 10);

		// Título: obligatorio, mínimo 10 caracteres, máximo 50
		System.out.print("Ingrese el título del profesional: ");
		titulo = scanner.nextLine();

		/*
		 * Fecha de ingreso: independiente si lo declara como una fecha o un String,
		 * debe ser desplegado con el formato DD/MM/AAAA
		 */

		do {
			System.out.println("Ingrese la fecha de ingreso del profesional (dd/MM/yyyy)");
			fechaIngreso = scanner.nextLine();
			if (fechaIngreso.length() != 10) {
				System.out.println("El formato de fecha es incorrecto. Debe ser (dd/MM/yyyy). ");
			}
		} while (fechaIngreso.length() != 10);

		Profesional profesional = new Profesional(nombres, fechaNacimiento, run, titulo, fechaIngreso);
		contenedor.almacenarProfesional(profesional);
		System.out.println("Profesional almacenado correctamente.");
	}

	private static void almacenarAdministrativo() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~ ALMACENAR ADMINISTRATIVO ~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String nombres, fechaNacimiento, area, experienciaPrevia;
		int run;

		// creamos condiciones para asegurar que se cumplan nuestras restricciones.
		// corresponde a un número menor a 99.999.999
		do {
			System.out.println("Ingrese el RUN del administrativo: ");
			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, ingrese un número:");
				scanner.nextLine();
			}
			run = scanner.nextInt();
			scanner.nextLine();

			if (run >= 999999999 || run <= 0) {
				System.out.print("El RUN debe ser un número menor a 99.999.999.");
			}
		} while (run >= 999999999 || run <= 0);

		// nombre: obligatorio, mínimo 10 caracteres, máximo 50
		do {
			System.out.print("Ingrese los nombres del administrativo: ");
			nombres = scanner.nextLine();
			if (nombres.length() < 10 || nombres.length() > 50) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (nombres.isEmpty() || nombres.length() < 10 || nombres.length() > 50);

		/*
		 * Fecha de nacimiento: obligatorio, independiente si lo declara como una fecha
		 * o string, debe ser desplegado con el formato DD/MM/AAAA
		 */

		do {
			System.out.println("Ingrese la fecha de nacimiento: (dd/MM/yyyy)");
			fechaNacimiento = scanner.nextLine();
			if (fechaNacimiento.length() != 10) {
				System.out.println("El formato de fecha es incorrecto. Debe ser (dd/MM/yyyy). ");
			}
		} while (fechaNacimiento.length() != 10);

		// Área: obligatorio, mínimo 5 caracteres, máximo 20

		do {
			System.out.print("Ingrese el área del administrativo: ");
			area = scanner.nextLine();
			if (area.length() < 5 || area.length() > 20) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (area.isEmpty() || area.length() < 5 || area.length() > 20);

		// Experiencia previa: máximo 100 caracteres

		do {
			System.out.print("Ingrese la experiencia previa del administrativo: ");
			experienciaPrevia = scanner.nextLine();
			if (experienciaPrevia.length() > 100) {
				System.out.print("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (experienciaPrevia.isEmpty() || experienciaPrevia.length() > 100);

		Administrativo administrativo = new Administrativo(nombres, fechaNacimiento, run, area, experienciaPrevia);
		contenedor.almacenarAdministrativo(administrativo);
		System.out.println("Administrativo almacenado correctamente.");
	}

	private static void almacenarCapacitacion() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~ ALMACENAR CAPACITACION ~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String dia, horaIngresada, lugar, duracion;
		int rutCliente, cantidadAsistentes = 0, identificador = 0;

		// Identificador: obligatorio, número interno de la capacitación manejado por la
		// empresa
		do {
			System.out.print("Ingrese el identificador de la capacitación: ");
			if (!scanner.hasNextInt() || identificador < 0) {
				System.out.println("El identificador es obligatorio");
				scanner.nextLine();
			}
			identificador = scanner.nextInt();
			scanner.nextLine();
		} while (identificador == 0);

		// RUT cliente: obligatorio
		do {
			System.out.println("Ingrese el RUN del cliente: ");
			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, ingrese un número:");
				scanner.nextLine();
			}
			rutCliente = scanner.nextInt();
			scanner.nextLine();

			if (rutCliente >= 999999999 || rutCliente <= 0) {
				System.out.print("El RUN debe ser un número menor a 99.999.999.");
			}
		} while (rutCliente >= 999999999 || rutCliente <= 0);

		// Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
		// “Domingo” (en ese formato)
		do {
			System.out.print("Ingrese el día de la capacitación: ");
			dia = scanner.nextLine();
			if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves")
					&& !dia.equals("viernes") && !dia.equals("sabado") && !dia.equals("domingo")) {
				System.out.print("Día no encontrado, por favor ingrese un valor entre lunes y domingo: ");
			}
		} while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves")
				&& !dia.equals("viernes") && !dia.equals("sabado") && !dia.equals("domingo"));

		// Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23,
		// minutos entre 0 y 59)
		System.out.println("Ingrese la hora de la capacitación (HH:MM): ");
		horaIngresada = scanner.nextLine();
		// Crear el objeto LocalTime a partir de la hora ingresada
		LocalTime hora = LocalTime.parse(horaIngresada, DateTimeFormatter.ofPattern("HH:mm"));

		// Lugar: obligatorio, mínimo 10 caracteres, máximo 50
		do {
			System.out.println("Ingrese el lugar de la capacitación: ");
			lugar = scanner.nextLine();
			if (lugar.length() < 8 || lugar.length() > 50) {
				System.out.println("Debe tener mínimo 10 caracteres o maximo 50 caracteres. ");
			}
		} while (lugar.isEmpty() || lugar.length() < 8 || lugar.length() > 50);

		// Duración: máximo 70 caracteres
		do {
			System.out.print("Ingrese la duración de la capacitación (minutos): ");
			duracion = scanner.nextLine();
			if (duracion.isEmpty() || duracion.length() > 50 || !duracion.matches("\\d+")) {
				if (duracion.isEmpty()) {
					System.out.println("La duración no puede estar vacía.");
				} else if (duracion.length() > 50) {
					System.out.println("Excede el número de caracteres, debe tener máximo 50 caracteres.");
				} else {
					System.out.println("La duración debe ser un número válido.");
				}
			}
		} while (duracion.isEmpty() || duracion.length() > 50 || !duracion.matches("\\d+"));

		// Cantidad de asistentes: obligatorio, número entero menor que 1000

		do {
			System.out.print("Ingrese la cantidad de asistentes: ");
			if (!scanner.hasNextInt() || cantidadAsistentes > 1000) {
				System.out.println("La cantidad de asistentes es obligatoria y debe ser un valor menor a 1000 ");
				scanner.nextLine();
			}
			cantidadAsistentes = scanner.nextInt();
			scanner.nextLine();
		} while (cantidadAsistentes > 1000);

		Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion,
				cantidadAsistentes);
		contenedor.almacenarCapacitacion(capacitacion);
		System.out.println("Capacitación almacenada correctamente.");
	}

	private static void eliminarUsuario() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~ ELIMINAR USUARIO ~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int run;
		// Solicitud para elimianr un usuario
		System.out.print("Ingrese el RUN del usuario a eliminar: ");
		run = scanner.nextInt();
		contenedor.eliminarUsuario(run);
		System.out.println("~~~~~~~~~~~~~~~~~~~eliminacion realizada ~~~~~~~~~~~~~~~~~~~");
	}

	private static void listarUsuarios() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~ LISTAR USUARIO ~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		contenedor.listarUsuarios();
	}

	private static void listarUsuariosPorTipo() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~ LISTAR USUARIOS POR TIPO ~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String[] tiposValidos = { "cliente", "administrativo", "profesional" };
		String tipo = "";

		while (true) {
			System.out.println("Ingrese el tipo de usuario (cliente, administrativo o profesional): ");
			tipo = scanner.nextLine().trim().toLowerCase();

			// Verifica si el tipo ingresado es válido
			boolean tipoValido = false;
			for (String tipoEnLista : tiposValidos) {
				if (tipo.equals(tipoEnLista)) {
					tipoValido = true;
					break;
				}
			}

			if (tipoValido) {
				break;
			} else {
				System.out.println(
						"Tipo de usuario inválido. Por favor, ingrese 'cliente', 'administrativo' o 'profesional'.");
			}
		}

		contenedor.listarUsuariosPorTipo(tipo);
	}

	private static void listarCapacitaciones() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~ LISTAR CAPACITACIONES ~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		contenedor.listarCapacitaciones();
	}

	public static void main(String[] args) {
		Main principal = new Main();
		principal.mostrarMenu();
	}

}