package br.com.exercicios;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 4;

        for (int i = 1; i <= cont; i++) {
            System.out.print("Digite o nome do "+i+"° atleta: ");
            String nome = sc.next();
            System.out.print("Qual a idade de "+ nome + ": ");
            int idade = sc.nextInt();

            if(idade < 10){
                System.out.println(nome + " participará da categoria Infantil");
            } else if (idade >= 11 && idade <= 15){
                System.out.println(nome + " participará da categoria Juvenil");
            } else if (idade >= 16 && idade <= 19){
                System.out.println(nome + " participará da categoria Pré - Adulto");
            } else {
                System.out.println(nome + " participará da categoria Adulto");
            }
            System.out.println("-------------------------------");
        }
        System.out.println("-------------------------------");
        System.out.println("FIM");
    }
}
