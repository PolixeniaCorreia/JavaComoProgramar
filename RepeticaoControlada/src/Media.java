import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("Digite a nota");
			int nota = input.nextInt();		
			total = total + nota;
			contador = contador + 1;
		}
		int media = total / 10;
		
		System.out.printf("%nTotal de todas as notas é %d%n", total);
		System.out.printf("A média é: %d%n" ,media);

	}

}
