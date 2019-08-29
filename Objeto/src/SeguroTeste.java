
public class SeguroTeste {

	public static void main(String[] args) {
		
		Seguro seguro1 = new Seguro(111111, "Toyota", "NJ"); 
		Seguro seguro2 = new Seguro(111111, "Ford", "ME"); 
			
		situacao(seguro1);
		situacao(seguro2);
		
	
	}
	private static void situacao(Seguro seguro) {
		System.out.println("Politica de Móveis:");
		System.out.printf(
		"Seguro #: %d; Carro: %s; Estado %s %s \n" + 
		"sem culpa estado %n%n",
		seguro.getNumeroApolice(), seguro.getCarro(),
		seguro.getEstado(),
		(seguro.SeguroSemCulpa() ? "é": "não é") );
		
	}	

}
