
public class VariavelTest {
	
	
	public static double media (double... numeros) {
		
		double total = 0.0; 
		
		for(double d : numeros) {
			total += d;
		}
		
		return total / numeros.length;	
	}

	public static void main(String[] args) {
		
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.println(""+d1+"\n"+d2+"\n"+d3+"\n"+d4+"");
		
		System.out.println("Media d1 e d2: " +media(d1,d2));
		System.out.println("Media d1,d2 e d3: " +media(d1,d2,d3));
		System.out.println("Media d1,d2,d3 e d4: " +media(d1,d2,d3,d4));
	
	}	
}
