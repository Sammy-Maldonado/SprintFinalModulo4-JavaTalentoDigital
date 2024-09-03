# Proyecto: Sistema de Gestión para una Empresa

## Alumno
- Sammy Maldonado

## Tecnologías utilizadas
- Java
- GitHub

## Descripción del proyecto
Este proyecto tiene como objetivo la creación de un sistema de gestión para una empresa que incluye la administración de usuarios, clientes, profesionales, administrativos, capacitaciones, accidentes, visitas en terreno, y revisiones. El sistema permite almacenar, listar y eliminar estos registros, así como realizar diversas operaciones específicas para cada entidad.

El proyecto se compone de las siguientes clases:

### Entidades Principales
- **Usuario**: Clase base que contiene atributos como nombre, fecha de nacimiento, y RUN. Incluye métodos como `mostrarEdad()` y `analizarUsuario()`.
- **Cliente**: Hereda de `Usuario` y agrega atributos como RUT, nombres, apellidos, teléfono, AFP, sistema de salud, dirección, comuna, y edad. Incluye métodos como `obtenerNombre()`, `obtenerSistemaSalud()`, y `analizarUsuario()`.
- **Profesional**: Hereda de `Usuario` y agrega atributos como título y fecha de ingreso. Implementa el método `analizarUsuario()`.
- **Administrativo**: Hereda de `Usuario` y agrega atributos como área y experiencia previa. Implementa el método `analizarUsuario()`.

### Entidades Adicionales
- **Capacitación**: Incluye atributos como identificador, RUT del cliente, día, hora, lugar, duración, y cantidad de asistentes. Incluye el método `mostrarDetalle()`.
- **Accidente**: Contiene detalles de un accidente como identificador, RUT del cliente, día, hora, lugar, origen, y consecuencias.
- **Visita en Terreno**: Incluye atributos como identificador, RUT del cliente, día, hora, lugar, y comentarios.
- **Revisión**: Contiene un identificador de la revisión, un identificador de la visita en terreno asociada, nombre alusivo a la revisión, detalle para revisar, y estado.

### Funcionalidades
- **Contenedor**: Clase que maneja dos listas, una de instancias de la interfaz `Asesoría` (que puede incluir `Usuario`, `Cliente`, `Profesional`, y `Administrativo`) y otra de objetos `Capacitación`. Incluye métodos para almacenar y eliminar usuarios y capacitaciones, así como para listar usuarios y capacitaciones.

### Interface
- **Asesoría**: Interface que declara el método `analizarUsuario()` que debe ser implementado por las clases que heredan de `Usuario`.

### Clase Principal
- **Principal**: Clase que crea una instancia de `Contenedor` y proporciona un menú principal con opciones para gestionar usuarios, capacitaciones, y ejecutar las operaciones principales del sistema.

## Repositorio
El proyecto completo, junto con el código fuente y la estructura de carpetas, está disponible en el siguiente repositorio de GitHub:
- [Repositorio del Proyecto](https://github.com/Sammy-Maldonado/SprintFinalModulo4-JavaTalentoDigital)