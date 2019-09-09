
public class Principal {

	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		System.out.println("Distribuição de notas:");
	
		for (int cont = 0; cont < array.length; cont++){
		
			if (cont == 10)
			System.out.printf("  "+100+": ");
			
			else
			System.out.printf("%02d-%02d: ",cont * 10, cont * 10 + 9);
	
		
			for (int esrelas = 0; esrelas < array[cont]; esrelas++)
			System.out.print("*");
		
			System.out.println();
		}
	
	}

}
