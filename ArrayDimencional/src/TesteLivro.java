
public class TesteLivro {

	public static void main(String[] args) {
		int [][] notasArray = {{87, 96, 70},
								{68, 87, 90},
								{94, 100, 90},
								{100, 81, 82},
								{83, 65, 85},
								{78, 87, 65},
								{85, 75, 83},
								{91, 94, 100},
								{87, 93, 73}};
		
		LivroNotas minhasNotasLivro = new LivroNotas("Introdução à programação Java", notasArray);
		
		System.out.println("Bem-vindo ao livro de notas" +minhasNotasLivro.getNomeCurso());
		
		minhasNotasLivro.notasProcessos();
	}
   
	
}
