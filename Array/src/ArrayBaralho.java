import java.security.SecureRandom;

public class ArrayBaralho {

		private Cartao[] baralho;
		private int cartao_atual; 
		private static final int NUMERO_DE_CARTOES = 52;
		
		private static final SecureRandom ran = new SecureRandom();
		
		public ArrayBaralho() {
			
			String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
					"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
			
			String[] ternos = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
			baralho = new Cartao[NUMERO_DE_CARTOES];
			cartao_atual = 0;
			
			for ( int cont = 0; cont < baralho.length; cont ++) {
				baralho[cont] = new Cartao(faces[cont % 13],ternos [cont/13]);
			}
		}
		
		public void aleatoria() {
			cartao_atual = 0;
			
			for(int primeiro = 0; primeiro < baralho.length; primeiro++) { 
				
				int second = ran.nextInt(NUMERO_DE_CARTOES); 
				
				Cartao temp = baralho[primeiro];
				baralho[primeiro] = baralho[second];
				baralho[second] = temp;
			}
		}
		
		public Cartao cartaoOferta() {
			if(cartao_atual < baralho.length) {
				return baralho [cartao_atual++];
			}else {
				return null;
			}
			
			
		}

}
