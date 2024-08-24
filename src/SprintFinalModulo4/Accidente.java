package SprintFinalModulo4;

import java.time.LocalDate;

public class Accidente {

	private int identificadorAccidente;
	private int rutCliente;
	private LocalDate dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	public Accidente() {
	}

	public Accidente(int identificadorAccidente, int rutCliente, LocalDate dia, String hora, String lugar,
			String origen, String consecuencias) {
		this.identificadorAccidente = identificadorAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;

	}

	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente: " + "\n" + "identificadorAccidente=" + identificadorAccidente + "\n" + "rutCliente="
				+ rutCliente + "\n" + "dia=" + dia + ", hora=" + hora + "\n" + "lugar=" + lugar + "\n" + "origen="
				+ origen + "\n" + "consecuencias=" + consecuencias;
	}

}
