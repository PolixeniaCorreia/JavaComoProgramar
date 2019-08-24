
public class Principal {

	public static void main(String[] args) {
		double valor;
		double valorSemJuros = 1000.0;
		double taxa = 0.05;
		
		System.out.println("Ano  Total do depósito");
		
		for (int ano = 1; ano <= 10; ++ano) {
			
			valor = valorSemJuros * Math.pow(1.0 + taxa, ano);
			
			System.out.printf("%3d%,15.2f%n", ano, valor);
			
		}
		
	}

}
