package br.com.exercicios;

import java.util.Scanner;

public class AlistamentoMilitar2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***** ALISTAMENTO MILITAR *****");
        System.out.println("-------------------------------");

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite seu sexo: ");
        String sexo = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        //if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") && idade < 18){
        if (sexo == "M" || sexo == "F" && idade < 18){
            System.out.println("Alistamento Não PERMITIDO");

        } else if(sexo == "M" && idade >= 18){
            System.out.println("Alistamento OBRIGÁTORIO");

        } else if(sexo == "F" && idade >= 18) {
            System.out.print("Deseja se Alistar ? : ");
            String resp = sc.next();

            if (resp.equalsIgnoreCase("sim")) {
                System.out.println("PARABÈNS e seja muito bem vinda");
            } else {
                System.out.println("Se mudar de ideia, estamos a disposição");
            }

        }

    }
}
