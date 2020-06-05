package br.com.exercicios;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("En qual dia da semana estamos: ");
        int dia = sc.nextInt();

        if(dia == 1){
            System.out.println("O dia da seman é DOMINGO");
        } else if (dia == 2){
            System.out.println("O dia da semana SEGUNDA");
        } else if (dia == 3){
            System.out.println("O dia da semana TERÇA");
        } else if (dia == 4){
            System.out.println("O dia da semana QUARTA");
        } else if (dia == 5){
            System.out.println("O dia da semana QUINTA");
        } else if (dia == 6){
            System.out.println("O dia da semana SEXTA");
        } else if (dia == 7){
            System.out.println("O dia da semana SABADO");
        } else {
            System.out.println("Dia INVÁLIDO");
        }


    }
}
