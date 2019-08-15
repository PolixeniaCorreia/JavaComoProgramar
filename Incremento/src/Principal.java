import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int c = 5;
		System.out.printf("c pós incremento: %d%n", c);
		System.out.printf("c pós incremento: %d%n", c++);
		System.out.printf("c pós incremento: %d%n", c);
	
		System.out.println();
		
		c = 5;
		System.out.printf("c pré incremento: %d%n", c);
		System.out.printf("c pré incremento: %d%n", ++c);
		System.out.printf("c pré incremento: %d%n", c);
	
	
	}

}
