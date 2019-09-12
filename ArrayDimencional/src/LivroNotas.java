public class LivroNotas {
	
	private String nomeCurso;
	private int [][] notas;
	
	public LivroNotas(String nomeCurso, int[][] notas) {
		
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}

	public String getNomeCurso() {
		
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso){
		
		this.nomeCurso = nomeCurso;
	}

	public void notasProcessos() {
		
		notasSaida();
		
		System.out.println("\nNotas baixas no livro é: "+getMinimo()+".\n"
				+"Notas altas no livro é: "+getMaximo()+".\n");
		
		graficoBarraSaida();
		
	}

	private int getMinimo() { 
		
		int notaBaixa = notas [0][0];
		
		for ( int [] notasEstudante : notas) {
			
			for(int nota : notasEstudante) {
				
				if(nota < notaBaixa) {
					
					notaBaixa = nota;
				}
			}
		} 
		
		return notaBaixa;
	}

	private int getMaximo() { 
		
		int notaAlta = notas [0][0];
		
		for( int [] notasEstudante : notas) {
			
			for(int nota : notasEstudante) {
				
				if (nota > notaAlta) {
					
					notaAlta = nota;
				}
			}
		}
		
		return notaAlta;	
	}
	
	public double getMedia(int[] conjuntoNotas) {
		
		int total = 0;
		
		for(int nota : conjuntoNotas) {
			
			total += nota;
		}
		
		return (double) total / conjuntoNotas.length;
		
	}
	
	private void graficoBarraSaida() {
		
		System.out.println("Distribuição geral de notas: ");
		
		int [] frequencia = new int [11];
		
		for (int [] notasEstudante : notas) {
			
			for(int nota : notasEstudante) {
				
				++frequencia[nota/10];
			}
		}
		
		for(int cont = 0; cont < frequencia.length; cont++) {
			
			if(cont == 10) {
				
				System.out.printf("   "+100+":");
		
			}else {
				
				System.out.printf(""+cont * 10+"-"+cont * 10 + 9+":");
				
			}
			
			for ( int estrelas = 0; estrelas < frequencia[cont]; estrelas++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}	
			
	}
	
	public void notasSaida () {
		
		System.out.println("As notas são: ");
		System.out.printf("              ");
		
		for(int test = 0; test < notas[0].length; test++) {
			
			System.out.printf("Test%d  ", test + 1);
			
		}
		
		System.out.println("  Média");
		
		for(int  estudante = 0; estudante < notas.length; estudante++) {	
			
			System.out.printf("Estudante " ,estudante + 1);
			
			for(int test : notas[estudante]) {
				
				System.out.printf("%7d", test);
			
			}
			
			double media = getMedia(notas[estudante]);
			
			System.out.printf("  %9.2f%n" ,media);
		}
	
	}

}
