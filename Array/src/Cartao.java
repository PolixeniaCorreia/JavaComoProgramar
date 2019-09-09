
public class Cartao {
	
	private String face;
	private String terno;
	
	public Cartao(String face, String terno) {
		this.face = face;
		this.terno = terno;
	}
	
	public String getFace() {
		return face;
	}
	
	public String getTerno() {
		return terno;
	}
	
	public void setFace(String face) {
		this.face = face;
	}


	public void setTerno(String terno) {
		this.terno = terno;
	}

	public String toString() {
		return face +"de "+ terno;
	}	

}
