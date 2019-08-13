import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		int total = 0;
		int notasInseridas = 0;
		
		System.out.printf("Digite uma nota ou -1 para sair: ");
		int nota = input.nextInt();
		
		while (nota != -1) {
			total = total + nota;
			notasInseridas = notasInseridas + 1;
			
			System.out.printf("Digite uma nota ou -1 para sair: ");
			nota = input.nextInt();
		}
		if(notasInseridas != 0) {
			double media = (double) total / notasInseridas;
			
			System.out.printf("Total das notas %d digitadas é: %d%n" , notasInseridas, total);
			System.out.printf("A media é: %.2fn", media);
		}else 
			System.out.printf("Nenhuma nota foi inserida!");
		
		
	}

}
