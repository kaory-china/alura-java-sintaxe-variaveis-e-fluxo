
public class MultiplosDe3 {

	public static void main(String[] args) {
		System.out.println("**imprimir multiplos de 3 at� 100**");
		System.out.println();
		
		int numero = 1;
		
		while (numero % 3 != 0) {
			numero++;
		}
		if (numero % 3 == 0) {
			for (int numero2 = numero; numero2 < 100; numero2+= 3) {
				System.out.print(numero2);
				System.out.print(" ");
			}
		}
		
	}
}

/* RESOLU��O DO CURSO!
 * public class MultiplosDeTresAteCem { public static void main (String[] args)
 * { for (int i = 3; i < 100; i += 3 ){ System.out.println(i); } } }
 */