
public class Principal {

	public static void main(String[] args) {
		int array [] = new int[10];
		
		System.out.println("Index   " + "Valor");
		
		for(int cont = 0; cont < array.length; cont++) {
			System.out.printf("%3d%8d%n", cont, array[cont]);
			
		}
		
		System.out.println();
		System.out.println("Index   " + "Valor");
		
		for(int cont = 0; cont < array.length; cont++) {
			 array[cont] = cont * 5;
			System.out.printf("%3d%8d%n", cont, array[cont]);
		}

	}

}
