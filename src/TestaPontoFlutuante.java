
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("meu salario é " + salario);
		
		// int num = 12.5; não aceita
		
		int divisao = 5 / 2; // 2
		double divisao2 = 5 / 2; // dá 2.0 pq 5 e 2 ainda sao ints
		double divisao3 = 5.0 / 2; // aqui sim dá 2.5, basta que um dos numeros seja double
		
		System.out.println(divisao);
		System.out.println(divisao2);
		System.out.println(divisao3);
	}

}
