
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("**testando mais condicionais**");
		
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		// || == or, && == and
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente não pode entrar");
		}
	}
}
