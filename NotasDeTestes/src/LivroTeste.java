
public class LivroTeste {

	public static void main(String[] args) {
		
		int [] notasArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		LivroNotas livroNotas = new LivroNotas("Introdução à programação Java ", notasArray);
		
		System.out.printf("Bem-vindo ao livro de notas " +livroNotas.getNome_curso());
		
		livroNotas.notas_processo();

	}

}
