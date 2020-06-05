package devdojo.exercicios;
/*
    Nesse exercicio eu vou utilizar todas ferramentas,
    vista no conteudo até a Aula 30 do Curso Logica de Programação DevDojo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SuperExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("===============================");
        System.out.println("***** AJUDANDO O USUÁRIO *****");
        System.out.println("===============================");

        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        int opcao = 0;
        while (opcao != 3) {

            System.out.println("Olá "+nome+ " temos algumas opções para te ajudar ");
            System.out.println("-------------------------------");
            System.out.println("1- Calcular Imposto de Renda");
            System.out.println("2- Depositar Salario");
            System.out.println("3- Sair");
            System.out.println("-------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("DIgite a sua renda mensal: ");
                    float salario = sc.nextFloat();
                    System.out.println("-------------------------------");

                    if (salario <= 1903.98) {
                        System.out.println("Você está ISENTO  do IMposto de Renda");

                    } else if (salario >= 1903.99 && salario <= 2826.65) {
                        System.out.println("Sua alíquota será de 7.5% com valor de R$ 142.80");
                    } else if (salario >= 2826.66 && salario <= 3751.05) {
                        System.out.println("Sua alíquota será de 15% com valor de R$ 354,80");
                    } else if (salario >= 3751.06 && salario <= 4664.68) {
                        System.out.println("Sua alíquota será de 22,5% com valor de R$ 636,13");
                    } else if (salario > 4664.68) {
                        System.out.println("Sua alíquota será de 25% com valor de R$ 702,50");
                    }
                    System.out.println("-------------------------------");
                    break;

                case 2:
                    System.out.print("Digite a sua renda mensal: ");
                    float sal = sc.nextFloat();
                    System.out.println("Seu salario terá um rendimento de 0.12% ao mês na CONTA_INVESTIMENTO");
                    System.out.println();
                    System.out.print("Quanto deseja depositar por mês: ");
                    float valorDep = sc.nextFloat();
                    float valotTotal = (valorDep * 0.12F) * 12;
                    float valorTotalDep = (valorDep * 12) + valotTotal;
                    System.out.println("================================================================");
                    System.out.println("O rendimento de sua aplicação em 12 meses será de R$ "+valotTotal);
                    System.out.println("Seu saldo será de R$ "+valorTotalDep+ " em 12 meses");
                    System.out.println("================================================================");

                    System.out.println("-------------------------------");
                    break;

                default:
                    opcao = 3;
                    System.out.println("--------------------------------");
                    System.out.println("Programa encerrado");
                    System.out.println("--------------------------------");
                    System.out.println("FIM..");
            }

        }
    }
}
