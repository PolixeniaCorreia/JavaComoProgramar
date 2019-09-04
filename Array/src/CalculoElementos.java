
public class CalculoElementos {

	public static void main(String[] args) {
		
		final int tam = 10;
		
		int[] array = new int [tam];

		
		for (int counter = 0; counter < array.length; counter++)
			array[counter] = 2 + 2 * counter;
			
			System.out.println( "Index"+ "      Value ");
		
		
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("  "+counter+"          "+array[counter]+" \n");
		
	}

}
