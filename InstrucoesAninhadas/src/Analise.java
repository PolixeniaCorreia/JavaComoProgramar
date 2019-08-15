import java.util.Scanner;

public class Analise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int passou = 0;
		int reprovou = 0;
		int quantEstudantes = 1;
		
		while (quantEstudantes <= 10) {
			System.out.println("Escolha (1- passou, 2- reprovou)");
			int resultado = input.nextInt();
			
			if( resultado == 1) {
				passou++;
			}else {
				reprovou++;
			}
			quantEstudantes++;
			
		}
		System.out.printf("Passou: %d%nReprovou: %d%n" ,passou ,reprovou);
		
		
		if(passou > 8) {
			System.out.println("Bônus para o Instrutor");
		}
		
	}

}
