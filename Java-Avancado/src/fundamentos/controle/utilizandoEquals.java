package fundamentos.controle;

import java.util.Scanner;

public class utilizandoEquals {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "CP850");

        System.out.println("Digite o nome do dia");
        String dia = entrada.nextLine();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido");
        }
        entrada.close();
    }

}
