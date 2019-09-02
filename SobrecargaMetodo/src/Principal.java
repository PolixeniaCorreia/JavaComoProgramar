
public class Principal {

	public static void main(String[] args) { 
		
		System.out.println("O quadrado do número 7 é: " + square(7));
		System.out.println("O quadrado do número 7.5 é: " + square(7.5));

	}
	private static int square(int i) {
		System.out.println("Chamando quadrado com argumento duplo  " +i);
		
		return i*i;
	}
	private static double square(double i) {
		System.out.println("Chamando quadrado com argumento duplo  " +i);
		
		return i*i;
	}

}
