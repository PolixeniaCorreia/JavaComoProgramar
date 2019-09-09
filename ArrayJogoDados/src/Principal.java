import java.security.SecureRandom;

public class Principal {

	public static void main(String[] args) {
		SecureRandom ran = new SecureRandom();
		
		int [] frequencia = new int [7];
		
		for ( int roll = 1; roll <= 6000000; roll++) {
			++frequencia[1 + ran.nextInt(6)];
			
		}
		
		System.out.println("Face Fequencia ");
		
		for( int face  = 1; face < frequencia.length; face++) {
			System.out.println(" "+face +"    "+frequencia[face]+"");
			
		}
			
			
	}

}
