package devdojo.exercicios.condicionais;

/*
    Tabela do Imposto de Renda
    Base de cálculo (R$)	Alíquota (%)	Parcela a deduzir do IRPF
    Até 1.903,98	isento	isento
    De 1.903,99 até 2.826,65	7,5%	R$142,80
    De 2.826,66 até 3.751,05	15%	R$354,80
    De 3.751,06 até 4.664,68	22,5%	R$636,13
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

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
        System.out.println("FIM");
    }
}
