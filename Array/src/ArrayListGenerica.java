import java.util.ArrayList;

public class ArrayListGenerica {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList();
	
		itens.add("red");
		itens.add(0,"yellow");
		
		System.out.println("Exibir conteúdo da lista com loop controlado por contador: ");
		
		for(int i = 0; i < itens.size(); i++) {
			System.out.println(""+itens.get(i));
		}
		display(itens, "Exibir conteúdo da lista com aprimorada para instrução: ");
		
		itens.add("green");
		itens.add("yellow");
		display(itens, "Lista com dois novos elementos: ");
		
		itens.remove("yellow");
		display(itens, "Remover primeira instância de amarelo");
		
		itens.remove(1);
		display(itens, "Remova o segundo elemento da lista (verde): ");
		
		System.out.printf("\"red\" is %svermelho é pecado na lista",
				itens.contains("red") ? "": "not ");
		
		System.out.println("Size: "+itens.size());
	
	}

	private static void display(ArrayList<String> itens, String cabecalho) {
		
		System.out.println(cabecalho);
		
			for(String item : itens) {
				System.out.println("" +item);
			}
			System.out.println();
	}

}
