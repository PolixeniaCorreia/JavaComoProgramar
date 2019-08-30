import java.security.SecureRandom;

public class Jogo {
	
	private static final SecureRandom random = new SecureRandom();
	
	private enum Status { CONTINUE, GANHOU, PERDEU};
	
	private static final int NAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12 ;
	
	
	public static void main(String[] args) {
		int meusPontos = 0;
		Status gameStatus;
		int primeiraRolagemDados = roolDice();
		
		switch (primeiraRolagemDados) {
		
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.GANHOU; 
			break;
		
		case NAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.PERDEU; 
			break;
		
		default:
			gameStatus = Status.CONTINUE; 
			meusPontos = primeiraRolagemDados;
			System.out.println("SUA PONTUAÇÃO: " +meusPontos);
			break;
		}
		while (gameStatus == Status.CONTINUE) {
			primeiraRolagemDados = roolDice();
			
			if(primeiraRolagemDados == meusPontos)
				gameStatus = Status.GANHOU;
			else if (primeiraRolagemDados == SEVEN)
				gameStatus = Status.PERDEU;
		}
	
		if (gameStatus == Status.GANHOU)
			System.out.println("VENCEU!!");
		else
			System.out.println("NÃO FOI DESSA VEZ");
			
	}

	public static int roolDice() {
		int partida1 = 1 + random.nextInt(6);
		int partida2 = 1 + random.nextInt(6);
		
		int soma = partida1 + partida2;
		
		System.out.println("Resultado rolado: "+partida1+", "+partida2+". Total: "+soma+"");
		
		return soma;
	}
}
