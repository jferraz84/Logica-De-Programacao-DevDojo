package br.com.exercicios;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero: ");

            int num = sc.nextInt();
            System.out.println("------------------------");

            if ((num % 2) == 0) {
                System.out.println("Esse numero " + num +" é par");
            } else {
                System.out.println("Esse numero " + num +" é impar");
            }
            System.out.println("------------------------");
            System.out.println("FIM");

    }
}
