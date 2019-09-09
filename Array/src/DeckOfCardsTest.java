
public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		ArrayBaralho myArrayBaralho = new ArrayBaralho();
		myArrayBaralho.aleatoria();
		
		for (int i = 1; i <= 52; i++) {
			System.out.println(" "+myArrayBaralho.cartaoOferta()+" ");
			
			if (i % 4 == 0)
				System.out.println();
		}

	}

}
