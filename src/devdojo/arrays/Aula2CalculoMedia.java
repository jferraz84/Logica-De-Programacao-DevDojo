package devdojo.arrays;

import java.util.Scanner;

public class Aula2CalculoMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notas[] = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite sua "+(i + 1)+"° nota: ");
            notas[i] = sc.nextDouble();

        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }
        double mediaTotal = media /4;
        System.out.println("O total da soma das notas são: " + media);
        System.out.println("Sua média é de " + mediaTotal);
    }
}
