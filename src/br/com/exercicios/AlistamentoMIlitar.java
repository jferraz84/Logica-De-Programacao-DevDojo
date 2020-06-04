package br.com.exercicios;

import java.util.Scanner;

public class AlistamentoMIlitar {
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

        String resultado = sexo;

        if (resultado.equalsIgnoreCase("m")) {
            if (sexo.equalsIgnoreCase("m") && idade >= 18) {
                System.out.println("Alistamento OBRIGATÓRIO");
            } else {
                System.out.println("Alistamento Não Permitido !");
            }

        } else if (resultado.equalsIgnoreCase("f")) {
            if (sexo.equalsIgnoreCase("f") && idade >= 18) {
                System.out.print("Deseja se Alistar ? : ");
                String resp = sc.next();

                if (resp.equalsIgnoreCase("sim")) {
                    System.out.println("PARABÈNS e seja muito bem vinda");
                } else {
                    System.out.println("Se mudar de ideia, estamos a disposição");
                }

            } else {
                System.out.println("Alistamento Não Permitido !");
            }

        }

        System.out.println("-------------------------------");
        System.out.println("FIM.......");
    }
}
