package devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula1IntroducaoWhiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        while (contador <= 10){
            System.out.println("Olá " +contador+ "° vez");
            contador++;
        }

    }
}
