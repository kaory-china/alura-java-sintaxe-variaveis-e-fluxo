
public class ComandoSwitch {
	
	public static void main(String[] args) {
		
		System.out.println("**testando comando switch**");
		
		String mes = "abril";
		
		switch (mes) {
			case "janeiro":
				System.out.println("mês = 1");
				break;
			case "fevereiro":
				System.out.println("mês = 2");
				break;
			case "março":
				System.out.println("mês = 3");
				break;
			case "abril":
				System.out.println("mês = 4");
				break;
			case "maio":
				System.out.println("mês = 5");
				break;
			case "junho":
				System.out.println("mês = 6");
				break;
			default:
				System.out.println("mês inválido");
				break;
		}
	}
}
