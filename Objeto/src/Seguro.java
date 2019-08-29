
public class Seguro {
	private int numeroApolice;
	private String carro;
	private String estado;
	
	public Seguro (int numeroApolice, String carro, String estado) {
		this.carro = carro;
		this.numeroApolice = numeroApolice; 
		this.estado = estado; 
	}
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean SeguroSemCulpa () {
		boolean nenhumEstadoFalha;
		
		switch (getEstado()) {
		case "MA": case "NJ": case "NY": case "PA":
			nenhumEstadoFalha = true;
			break;
			default:
			nenhumEstadoFalha = false;
			break;
		}
		
		return nenhumEstadoFalha;
	}
		
}
