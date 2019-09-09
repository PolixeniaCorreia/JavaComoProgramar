
public class AnaliseEnquete {

	public static void main(String[] args) {
		
		int respostas [] = { 5,6,15,3,14,3,1,2,4,5};
		int frequencia [] = new int[6];
		
		
		for(int responda = 0; responda < respostas.length; responda++) {
			
			try {
				++frequencia[respostas[responda]]; 
				
			}catch (ArrayIndexOutOfBoundsException e) { 
				System.out.println(e);
				System.out.println("Respostas ["+responda+"] = "+respostas[responda]+"");
				
			}
			
			System.out.println("Avaliação  Frequencia");
			
			for (int avaliacao = 1; avaliacao < frequencia.length; avaliacao++)
				System.out.println(" "+avaliacao+"      "+frequencia[avaliacao]+"");;
				
			
		}

	}

}
