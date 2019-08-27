import java.awt.event.ContainerAdapter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int notasInseridas = 0;
		int notaA = 0;
		int notaB = 0;
		int notaC = 0;
		int notaD = 0;
		int notaE = 0;
		int notaF = 0;
		
		System.out.println(" "+ "Digite uma nota entre 0-100. Para sair digite <ctrl> d e enter");
		
		while (input.hasNext()) {
			int nota = input.nextInt();
			total += nota;
			++notasInseridas;
			
			switch (nota / 10) {
			
			case 9:
			case 10:
				++notaA;
				break;
				
			case 8 :
				++notaB;
				break;
				
			case 7:
				++notaC;
				break;
				
			case 6:
				++notaD;
				break;
				
			default:
				++notaF;
				break;
			}
		}

		System.out.println("Relatório de Notas");
		
		if ( notasInseridas != 0) {
			
			double media = (double) total / notasInseridas;
			
			System.out.println("Total das notas inseridas: "+notasInseridas+", "
					+ "total: "+total);
			
			System.out.println("A média da classe é: " +media);
			
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Numero de estudantes que receberam cada série: ",
					"A: ", notaA,
					"B: ", notaB,
					"C: ", notaC,
					"D: ", notaD,
					"E: ", notaE,
					"F: ", notaF);
		}else
			System.out.println("Nenhuma nota foi inserida");
		
		}

}
