import java.security.SecureRandom;

public class SeparandoValoresGerados {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		int frequencia1 = 0;
		int frequencia2 = 0;
		int frequencia3 = 0;
		int frequencia4 = 0;
		int frequencia5 = 0;
		int frequencia6 = 0;

		for(int roll = 1; roll <= 6000000; roll++) {
			
			int var = 1 + random.nextInt(6);
			
			switch (var) {
			
			case 1:
				++frequencia1;
				break;
				
			case 2:
				++frequencia2;
				break;
				
			case 3:
				++frequencia3;
				break;
				
			case 4:
				++frequencia4;
				break;
				
			case 5:
				++frequencia5;
				break;
				
			case 6:
				++frequencia6;
				break;

			}		
		}
		
		System.out.println("Face   Frequência");
		System.out.printf("1  \t "+frequencia1+" \n"
				+ "2  \t "+frequencia2+" \n"
				+ "3  \t "+frequencia3+" \n"
				+ "4  \t "+frequencia4+" \n"
				+ "4  \t "+frequencia4+" \n"
				+ "5  \t "+frequencia5+" \n"
				+ "6  \t "+frequencia6+" \n");

		
		
	}

}
