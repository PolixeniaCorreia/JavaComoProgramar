import java.lang.reflect.Array;

public class ArrayLinhaComando {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			
			System.out.println("ERRO : Digite novamente o inteiro, "
					+ "um tamanho de matriz , valor inicial de incremento.");
		}else {
			
			int arrayLength = Integer.parseInt(args[0]);
			int array [] = new int[arrayLength];
			
			int valorInicial = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
		
		
			for(int cont = 0; cont < array.length; cont++) {
				array[cont] = valorInicial + increment * cont;
				
			}
			System.out.println("Index  "+"Valor");
			
			for(int cont = 0; cont < array.length; cont++) {
				System.out.printf("%5d%8d%n", cont, array[cont]);
			}
		}
		
	}

}
