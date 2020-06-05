package devdojo.switchcase;

import java.util.Scanner;

public class Aula2TipoDeConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String cliente = sc.next();

        System.out.println("----------------------------------");
        System.out.println("Temos 3 tipos de conta");
        System.out.println("1- CONTA_CORRENTE");
        System.out.println("2- CONTA_POUPANÇA");
        System.out.println("3- CONTA_INVESTIMENTO");
        System.out.println("----------------------------------");
        System.out.print("Digite o tipo de conta escolhida: ");
        int conta = sc.nextInt();

        switch (conta) {

            case 1:
                System.out.println(cliente + ", a CONTA_CORRENTE, cobra uma taxa de 0.05% ao mês");
                break;
            case 2:
                System.out.println(cliente + ", a CONTA_POUPANÇA, cobra uma taxa de 0.02% ao mês");
                break;
            case 3:
                System.out.println(cliente + ", a CONTA_INVESTIMENTO, cobra uma taxa de 0.1% ao mês");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");

        }
        System.out.println("----------------------------------");
        System.out.println("Obrigado por escolher o nosso Banco");
        System.out.println("----------------------------------");
        System.out.println("FIM");

    }
}
