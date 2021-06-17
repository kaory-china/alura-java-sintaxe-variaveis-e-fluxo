
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0;
		
		System.out.println("**testando o while**");
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("**testando o for**");
		for (int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);
		}
	}

}
