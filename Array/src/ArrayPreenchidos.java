
public class ArrayPreenchidos {

	public static void main(String[] args) {
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.println(" "+ "Index  " + "  Value");
		
		for(int cont = 0; cont < array.length; cont++ ) {
			System.out.println("   "+ cont + "       "+ array[cont]);
		}
	}

}
