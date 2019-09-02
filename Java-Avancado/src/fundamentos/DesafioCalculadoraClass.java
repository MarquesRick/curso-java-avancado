package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraClass {

    Scanner entrada = new Scanner(System.in);
    public int escolha;
    double rNumero1;
    double rNumero2;
    double resultado;

    DesafioCalculadoraClass() {
        // Constructor
    }

    public void getResposta() {

        System.out.println("Insira o primeiro valor");
        rNumero1 = entrada.nextDouble();
        System.out.println("Insira o segundo valor");
        rNumero2 = entrada.nextInt();
        System.out.println("Escolha uma operação:\n|1| - Soma, |2| - Subtração, |3| - Modulo, |4| - Divisão, |5| - Multiplicação");
        escolha = entrada.nextInt();
        entrada.close();

    }

    public void getAction() {

        if (escolha == 1) {
            resultado = rNumero1 + rNumero2;
        } else {
            if (escolha == 2) {
                resultado = rNumero1 - rNumero2;

            } else {
                if (escolha == 3) {
                    resultado = rNumero1 % rNumero2;
                } else {
                    if (escolha == 4) {
                        resultado = rNumero1 / rNumero2;
                    } else if (escolha == 5) {
                        resultado = rNumero1 * rNumero2;
                    }
                }

            }
        }

    }

    public void showResultado() {
        System.out.println("Resultado da operação escolhida foi:\n" + (int)resultado);
    }
}
