
public class ComandoSwitch {
	
	public static void main(String[] args) {
		
		System.out.println("**testando comando switch**");
		
		String mes = "abril";
		
		switch (mes) {
			case "janeiro":
				System.out.println("m�s = 1");
				break;
			case "fevereiro":
				System.out.println("m�s = 2");
				break;
			case "mar�o":
				System.out.println("m�s = 3");
				break;
			case "abril":
				System.out.println("m�s = 4");
				break;
			case "maio":
				System.out.println("m�s = 5");
				break;
			case "junho":
				System.out.println("m�s = 6");
				break;
			default:
				System.out.println("m�s inv�lido");
				break;
		}
	}
}
