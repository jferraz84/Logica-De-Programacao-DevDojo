package devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula4DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int desejaContinuar = 1;
        do {
            System.out.print("PLAYER 1: Digite um numero de 1 a 10: ");
            int numero1 = sc.nextInt();
            System.out.print("PLAYER 2: Digite um numero de 1 a 10: ");
            int numero2 = sc.nextInt();

            System.out.println("Acertou " +(numero1 == numero2));
            System.out.println("Deseja continuar jogando ? ");
            System.out.println("1: Sim");
            System.out.println("2: Não");
            System.out.print("R: ");
            desejaContinuar = sc.nextInt();
        } while (desejaContinuar == 1);
        System.out.println("FIM do Jogo");

    }
}
