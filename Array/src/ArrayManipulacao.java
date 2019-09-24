import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayManipulacao {

	public static void main(String[] args) {
		
		double doubleArray [] = { 8.4, 9.3, 0.2, 7.9, 3.4};
		
		//sort - muda a ordem dos elementos
		Arrays.sort(doubleArray);
		System.out.printf("doubleArray: ");
		
		for(double valor : doubleArray) {
			System.out.printf("%.1f ", valor);
		}
		
		//fill - preenche a matriz com um valor
		int matrizIntPreenchida [] = new int[10]; 	
		Arrays.fill(matrizIntPreenchida, 7);
		displayArray(matrizIntPreenchida, "matrizIntPreenchida");
		
		int intArray[] = { 1, 2, 3, 4, 5, 6 };	
		int intArrayCopy[] = new int [intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy %n", ( b ? "==" : "!="));
		
		b = Arrays.equals(intArray, matrizIntPreenchida);
		System.out.printf("intArray %s intArrayCopy%n", (b ? "==" : "!="));
		
		int localização = Arrays.binarySearch(intArray, 5);
		
		
		if(localização >= 0) {
			System.out.printf("Encontrado 5 no elemento %d em intArray %n" ,localização);	
		}else {
			System.out.println("5 não encontrado no Array ");
		}
		
		
		localização = Arrays.binarySearch(intArray, 8763);
		
		
		if(localização >= 0) {
			System.out.printf("Encontrado 8763 no elemento %d em intArray %n");
		}else {
			System.out.println("8763 não encontrado no intArray");
		}
			
	}
	
	public static void displayArray(int array[], String descrição) {
		System.out.printf(" %n"+descrição);
		
		for(int valor : array) {
			System.out.printf(" "+ valor);
		}	
	}

}
