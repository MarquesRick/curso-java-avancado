package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students?");
        int qntStudent = input.nextInt();

        System.out.println("How many grades by students?");
        int qntGrades = input.nextInt();

        double[][] classGrades = new double[qntStudent][qntGrades];

        double total = 0;
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades[i].length; j++) {
                System.out.printf("Report grade %d of student %d", j, i);
                classGrades[i][j] = input.nextDouble();
                total+= classGrades[i][j];
            }
        }

        double average = total / (qntStudent * qntGrades);
        System.out.printf("The average grade is: %d", average);

        input.close();
    }
}
