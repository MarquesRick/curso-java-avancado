package fundamentos.console.scanner;

import java.util.Scanner;

public class ScannerClass {

	String nome;
	String sobrenome;
	String ra;
	double soma;
	double nota1;
	double nota2;
	Scanner entrada = new Scanner(System.in);

	public ScannerClass() {

	}

	public void receberDados() {

		System.out.println("Digite seu primeiro nome: ");
		nome = entrada.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = entrada.next();
		System.out.println("Digite RA: ");
		ra = entrada.next();
		// entrada.close();

	}

	public void getNota(double nota1, double nota2) {

		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		entrada.close();

		soma = ((nota1 + nota2) / 2);
		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	/*public void getSoma() {

		System.out.println(soma);
		entrada.close();
	}*/

	public void getDadosFinais() {
		System.out.println("\n-------------------------------------------\n");
		
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		System.out.println("RA do aluno " + nome + " " + sobrenome + ": " + ra);
		System.out.println("Primeira nota foi: " + nota1);
		System.out.println("Segunda nota foi: " + nota2);
		System.out.println("\n-------------------------------------------\n");
		System.out.println("Média Final: " + soma);
	}
}
