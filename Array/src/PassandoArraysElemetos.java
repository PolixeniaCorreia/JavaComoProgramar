
public class PassandoArraysElemetos {

	public static void main(String[] args) {
	int array [] = { 1, 2, 3, 4, 5};
	
	System.out.println("Efeitos da passagem de referência para toda a matriz Os valores da matriz original são: ");
    
	for(int value : array) {
		System.out.println(" "+value+" ");
	}
	modifyArray(array);
	System.out.println("Os valores da matiz modificada: ");
	
	for(int value : array)
		System.out.println(""+value+"");
	
	System.out.println("Efeitos de passagem do valor de elemento da matriz: matriz[3] antes de modifyElement: " +array[3]);
	
	modifyElement(array[3]); 
	System.out.println("Matriz após modifyElement: " +array[3]);
	
	}
	private static void modifyElement(int elemento) {
		elemento *= 2;
		System.out.println("Valor do Elemento modifyElement: "+elemento);
		
	}
	public static void modifyArray(int[] array2) {
		for(int cont = 0; cont < array2.length; cont++) {
			array2[cont] *= 2;
		}
	}
	
	
}

