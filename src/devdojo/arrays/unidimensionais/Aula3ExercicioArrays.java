package devdojo.arrays.unidimensionais;

import java.util.Scanner;

public class Aula3ExercicioArrays {
    public static void main(String[] args) {

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetor 1, posição "+i+ ":");
            array1[i] = sc.nextInt();

        }
        for (int i = 0; i < array2.length ; i++) {
            System.out.println("Vetor 2, posição "+i+ ":");
            array2[i] = sc.nextInt();

        }
        System.out.println("--------------------------------");
        for (int i = 0; i < array3.length ; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.println("Resultado do Vetor 3 multiplicado, na posição "+ i +" = "+array3[i] + " ");

        }
        System.out.println("==================================");
        System.out.println("*****    FIM do Programa     *****");
        System.out.println("==================================");


    }
}
