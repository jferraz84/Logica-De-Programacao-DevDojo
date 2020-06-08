package devdojo.arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aula1IntroducaoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double[] notas = new double[4];

        System.out.print("Digite sua 1° nota: ");
        notas[0] = sc.nextDouble();
        System.out.print("Digite sua 2° nota: ");
        notas[1] = sc.nextDouble();
        System.out.print("Digite sua 3° nota: ");
        notas[2] = sc.nextDouble();
        System.out.print("Digite sua 4° nota: ");
        notas[3] = sc.nextDouble();

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("--------------------------");
        System.out.println("Sua média é de: " + media);
        System.out.println("--------------------------");
        System.out.println("*** FIM DO PROGRAMA ***");

    }
}
