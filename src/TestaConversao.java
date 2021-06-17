
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		// int valor = salario; não compila pq estamos tentando atribuir uma variavel de tipo int em outro do tipo double
		
		int valor = (int) salario; // casting = converter o tipo da variavel, atenção qto a peda de acuracidade do valor!
		
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		// float pontoFlutuante = 3.14; // java não compila pq pra ele 3.14 é um double
		float pontoFlutuante = 3.14f; // usando o 'f' ao final vc confirma que se trata de um float
		System.out.println(pontoFlutuante);
	}
}
