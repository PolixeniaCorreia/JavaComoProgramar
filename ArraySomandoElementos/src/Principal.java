public class Principal {

	public static void main(String[] args) {
		
		int array [] = {87, 68, 94, 100, 83,
				78, 85, 91, 76, 87};
		int total = 0;
		
	for(int cont = 0; cont < array.length; cont++) {
		total += array[cont];
	}
	System.out.println("TOTAL DE ELEMENTOS DO ARRAY: "+total);
	
	}

}
