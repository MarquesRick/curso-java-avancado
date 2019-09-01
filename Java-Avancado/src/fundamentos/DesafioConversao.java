package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		double media;
		
		System.out.println("Insira primeiro salario: ");
		salario1 = scanner.next().replace(",", ".");
		System.out.println("Insira segundo salario: ");
		salario2 = scanner.next().replace(",", ".");
		System.out.println("Insira terceiro salario: ");
		salario3 = scanner.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		media = ((valor1 + valor2 + valor3) / 3);
		
		System.out.println("Media dos sal�rios � = " + 	media);
		
		scanner.close();
		
	}
}
