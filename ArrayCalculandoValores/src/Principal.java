import java.lang.reflect.Array;

public class Principal {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		int array [] = new int[ARRAY_LENGTH];
		
		
		for(int cont = 0; cont < array.length; cont++ ){
			array[cont] = 2 + 2 * cont;
			
		}
		System.out.println("Index   " +"Valor");
		
		for(int cont = 0; cont < array.length; cont++) {
			System.out.printf("%3d%8d%n",cont ,array[cont]);
		}
	}

}
