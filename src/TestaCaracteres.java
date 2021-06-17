
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		// tipo char guarda carctere da tabela unicode
		char letra = 'a';
		System.out.println(letra);
		
		// vc tbm pode atribuir o valor referencia do char da tabela: 66 = B
		char valor = 66;
		System.out.println(valor);
		
		// valor = valor + 1; não vai compilar pq são dois tipos de variaveis diferentes int e char
		// java vai transferomar o resultado para o "maior" tipo que é o int
		// pra resolver isso, a gente converte usando casting:
		valor = (char) (valor + 1);  
		System.out.println(valor);
		
		// String não chega a ser reserved word e tem que ser com S maiusculo
		String palavra = "alura cursos online de tecnologia ";
		// na soma com strings o java vai converter o int em string e concatenar
		System.out.println(palavra + 2020);
	}
}
