package devdojo.switchcase;

import java.util.Scanner;

public class Aula1DiasDaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("En qual dia da semana estamos: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("O dia da semana escolhido é DOMINGO");
                break;
            case 2:
                System.out.println("O dia da semana escolhido é SEGUNDA");
                break;
            case 3:
                System.out.println("O dia da semana escolhido é TERÇA");
                break;
            case 4:
                System.out.println("O dia da semana escolhido é QUARTA");
                break;
            case 5:
                System.out.println("O dia da semana escolhido é QUINTA");
                break;
            case 6:
                System.out.println("O dia da semana escolhido é SEXTA");
                break;
            case 7:
                System.out.println("O dia da semana escolhido é SÁBADO");
                break;
        }

    }
}
