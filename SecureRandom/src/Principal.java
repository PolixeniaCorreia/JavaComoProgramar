import java.security.SecureRandom;

public class Principal {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		for(int cont = 1; cont <= 20; cont++) {
			// escolhe um numero entre 1 e 6
			int var = 1 + randomNumbers.nextInt(6);
			
			System.out.println(" "+ var);
			
			if (cont %5 == 0)
				System.out.println("");
		}

	}

}
