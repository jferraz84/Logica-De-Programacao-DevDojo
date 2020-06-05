package devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class ImprimindoImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroDig = sc.nextInt();
        System.out.println("--------------------------------------");

        int contador = 0;
        while (contador <= numeroDig) {

            if ((contador % 2) != 0) {
                System.out.println("Os numeros impares de 0 a " + numeroDig + " são " + contador);

            }
            contador++;
        }
        System.out.println("--------------------------------------");
        System.out.println("FIM");
    }
}
