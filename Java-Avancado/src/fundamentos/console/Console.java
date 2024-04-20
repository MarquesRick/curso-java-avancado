package fundamentos.console;

import java.util.Calendar;
import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		Scanner entrada = new Scanner(System.in); //keyboard input system
		
		
		System.out.println("Entre com nome: ");
		String nome = entrada.nextLine();
		System.out.println("Entre com sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Entre com nome da Rua: ");
		String rua = entrada.nextLine();
		
		System.out.println("Entre com nome do bairro: ");
		String bairro = entrada.nextLine();
		System.out.println("Entre com numero da casa: ");
		String numero = entrada.nextLine();
		System.out.println("Entre com idade: ");
		int idade = entrada.nextInt();

		entrada.close();
		System.out.println("Idade é: " + idade);
		System.out.printf("Voce nasceu em: " + (calendario.get(Calendar.YEAR) - idade) + "\n");
		System.out.println("Nome é: " + nome);
		System.out.println("Sobrenome é: " + sobrenome);
		System.out.println("Nome completo: " + nome + " " + sobrenome );
		System.out.println("Rua é: " + rua);
		System.out.println("Numero é: " + numero);
		System.out.println("Bairro é: " + bairro);
		
	}

}
