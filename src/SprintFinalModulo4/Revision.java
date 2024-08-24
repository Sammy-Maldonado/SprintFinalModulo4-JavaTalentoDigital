package SprintFinalModulo4;

public class Revision {

	private int identificadorRevision;
	private int identificadorVisita;
	private String nombreAlusivo;
	private String detalleRevisar;
	private int estado;

	public Revision() {
	}

	public Revision(int identificadorRevision, int identificadorVisita, String nombreAlusivo, String detalleRevisar,int estado) {
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisita = identificadorVisita;
		this.nombreAlusivo = nombreAlusivo;
		this.detalleRevisar = detalleRevisar;
		this.estado = estado;
	}

	public int getIdentificadorRevision() {
		return identificadorRevision;
	}

	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getNombreAlusivo() {
		return nombreAlusivo;
	}

	public void setNombreAlusivo(String nombreAlusivo) {
		this.nombreAlusivo = nombreAlusivo;
	}

	public String getDetalleRevisar() {
		return detalleRevisar;
	}

	public void setDetalleRevisar(String detalleRevisar) {
		this.detalleRevisar = detalleRevisar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision: " + 
				"identificadorRevision=" + identificadorRevision + 
				"identificadorVisita=" + identificadorVisita + 
				"nombreAlusivo=" + nombreAlusivo + 
				"detalleRevisar=" + detalleRevisar +
				"estado=" + estado ;
	}

}