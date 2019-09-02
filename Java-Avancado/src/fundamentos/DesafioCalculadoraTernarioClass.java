package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraTernarioClass {

    Scanner entrada = new Scanner(System.in);

    double rNumero1;
    double rNumero2;
    String op;
    double resultado;

    DesafioCalculadoraTernarioClass() {
        // Constructor
    }

    public void getResposta() { //Pegar valor inserido pelo User

        System.out.println("Insira o primeiro valor");
        rNumero1 = entrada.nextDouble();
        System.out.println("Insira o segundo valor");
        rNumero2 = entrada.nextInt();
        System.out.println("Escolha uma operação");
        op = entrada.next();
        entrada.close();

    }

    public void getAction() { //Lógica

        resultado = "+".equals(op) ? rNumero1 + rNumero2 : 0;
        resultado = "-".equals(op) ? rNumero1 - rNumero2 : resultado;
        resultado = "*".equals(op) ? rNumero1 * rNumero2 : resultado;
        resultado = "/".equals(op) ? rNumero1 / rNumero2 : resultado;
        resultado = "%".equals(op) ? rNumero1 % rNumero2 : resultado;


    }

    public void showResultado() { //Mostra resultados

        System.out.println("Resultado da operação escolhida foi:\n");
        System.out.printf("%.2f %s %.2f = %.2f", rNumero1, op, rNumero2, resultado);
    }
}
