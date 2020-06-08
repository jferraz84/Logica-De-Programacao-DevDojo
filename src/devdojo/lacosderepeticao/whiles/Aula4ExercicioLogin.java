package devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula4ExercicioLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String login = "jferraz";
        final int password = 170627;

        System.out.println("===============================");
        System.out.println("***** Acessando o Sistema *****");
        System.out.println("===============================");

        while (true){
            System.out.print("Digite seu login: ");
            String loginDigitado = sc.next();
            System.out.print("Digite sua senha numérica: ");
            int passwordDigitado = sc.nextInt();

            if(login.equals(loginDigitado) && password == passwordDigitado){
                System.out.println("Acesso CONCEDIDO");
                break;
            }
                System.out.println("Acesso NEGADO");

        }
        System.out.println("-------------------------------");
        System.out.println("**** FIM do Programa ****");
    }
}
