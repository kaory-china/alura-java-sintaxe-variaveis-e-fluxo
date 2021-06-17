
public class TestaLacos2 {
	
	public static void main(String[] args) {
		System.out.println("testando lacos com break");
		
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) { // coluna <= linha
				
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
				// System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
