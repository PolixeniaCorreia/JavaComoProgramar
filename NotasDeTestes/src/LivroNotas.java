public class LivroNotas {
	
	private String nome_curso;
	private int [] notas;
	
	public LivroNotas(String nome_curso, int[] notas) {
		this.nome_curso = nome_curso;
		this.notas = notas;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public void notas_processo() {
		notasSaida();
		
		System.out.println("Classe média é: "+getMedia());
		System.out.println("A nota mais baixa é: "+getMinimo()+".\nA nota mais alta é: "+getMaximo()+".\n");
		
		barraDeSaida();
	}

	private void notasSaida() {
		System.out.println("As notas são: \n");
		
		for (int estudante = 0; estudante < notas.length; estudante++) {
			System.out.println("Estudante "+estudante + 1+":"+notas[estudante]+"");
			
		}
		System.out.println();
	}

	private void barraDeSaida() {
		System.out.println("Distribuição de Notas:");
		
		int [] frequencia = new int [11];
		
		for (int nota : notas) {
			++frequencia[nota/10];
		}
		
		for(int cont = 0; cont < frequencia.length;cont++) {
			
			if(cont == 10) {
				System.out.printf("   "+100+": ");
			}else {
				System.out.printf(""+cont*10+"-"+cont*10+9+": ");
			}
			
			for (int estrelas = 0; estrelas < frequencia [cont]; estrelas++) {
				System.out.printf("*");
			}
			
		System.out.println();
		
		}
	}

	private double getMedia() {
		
		int total = 0;
		
		for(int nota : notas) {
			total += nota;
		}
		
		return (double) total / notas.length;
	}

	private int getMaximo() {
		
		int notaAlta = notas[0];
		
		for( int nota : notas) {
			
			if(nota > notaAlta) {
				notaAlta = nota;
			}
		}
		
		return notaAlta;
	}

	private int getMinimo() {
		
		int notaBaixa = notas [0];
		
		for( int nota : notas) {
			
			if(nota < notaBaixa) {
				notaBaixa = nota;
			}
		}
		
		return notaBaixa;
	}
	
}
