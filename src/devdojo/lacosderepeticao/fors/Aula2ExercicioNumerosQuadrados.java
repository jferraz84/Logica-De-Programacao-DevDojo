package devdojo.lacosderepeticao.fors;
/*
    Elaborar um programa que apresente
    os quadrados dos números inteiros
    existentes na faixa de valores de 15 até 200.
 */

import java.util.Scanner;

public class Aula2ExercicioNumerosQuadrados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 15; i <= 200; i++) {
            System.out.println("O numero: "+i+ " sobre ^2: " + Math.pow(i, 2));
        }
    }
}
