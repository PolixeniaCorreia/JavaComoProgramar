import java.nio.file.attribute.UserPrincipalLookupService;

public class Principal {
	
	private static int x = 1;
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("X é: " +x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.println("Valor de x é: "+x);
		
	}

	private static void useField() {
		System.out.println("Ao inserir o método useField: " +x);
		  x*= 10;
		  System.out.println("Campo x antes de sair do método useField é: " +x);
		
	}

	private static void useLocalVariable() {
		int x = 25;
		System.out.println("Local x ao inserir o método useLocalVariable é: "+x);
		++x;
		System.out.println("Local x antes de sair do método useLocalVariable é: "+x);
	}

}
