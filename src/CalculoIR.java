
public class CalculoIR {
	
	public static void main(String[] args) {
		
		System.out.println("**verificando alíquotas de IR**");
		
		double salario = 3751.01;
				
		if (salario > 1900.00 && salario <= 2800.0) {
			System.out.println("a sua alíquota é de 7.5% e pode deduzir R$ 142");
		} else if (salario > 2800.0 && salario <= 3751.00){			
				System.out.println("a sua alíquota é de 15% e pode deduzir R$ 350");
			} else if (salario > 3751.00 && salario <= 4664.0) {
				System.out.println("a sua aliquota é de 22.5% e pode reduzir R$ 636");
			}
		}
	}
	
