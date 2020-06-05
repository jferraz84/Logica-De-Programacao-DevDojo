package devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Calcula a tabuada");
        System.out.println("----------------------------------------------");

        System.out.print("Digite o numero da Tabuada que você quer saber: ");
        int tabuada = sc.nextInt();
        System.out.println("----------------------------------------------");

        //int cont = 0;

        for (int i = 1; i <= 10; i++) {
            int result = tabuada * i;
            System.out.println(tabuada+" X " +i+ " = " +result);

        }
        System.out.println("----------------------------------------------");
        System.out.println("FIM");
    }
}
