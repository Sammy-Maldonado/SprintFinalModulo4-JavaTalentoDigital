package SprintFinalModulo4;

import java.time.LocalDate;

public class VisitaEnTerreno {

	private int identificadorVisita;
	private int rutCliente;
	private LocalDate dia;
	private String hora;
	private String lugar;
	private String comentarios;

	public VisitaEnTerreno() {
	}

	public VisitaEnTerreno(int identificadorVisita, int rutCliente, LocalDate dia, String hora, String lugar,
			String comentarios) {
		this.identificadorVisita = identificadorVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno" + "\n" + "identificadorVisita=" + identificadorVisita + "\n" + "rutCliente="
				+ rutCliente + "\n" + "dia=" + dia + "\n" + "hora=" + hora + "\n" + "lugar=" + lugar + "\n"
				+ "comentarios=" + comentarios;
	}
}
