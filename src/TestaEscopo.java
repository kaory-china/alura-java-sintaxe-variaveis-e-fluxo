
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("**testando escopo de variáveis**");
		boolean acompanhado;
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
