package devdojo.exercicios.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoImpostoDeRendaGanhosAnual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o seu rendimento liquido mensal: ");
        float rendMensal = sc.nextFloat();

        float rendAnual = rendMensal * 12;
        System.out.println("Sua renda Anual foi de " + rendAnual);
        System.out.println("---------------------------------------");

        if (rendAnual <= 22847.76) {
            System.out.println("Você está ISENTO  do Imposto de Renda");

        } else if (rendAnual >= 22847.77 && rendAnual <= 33919.80) {
            System.out.println("Sua alíquota será de 7.5% com valor de R$ 142.80");
        } else if (rendAnual >= 33919.81 && rendAnual <= 45012.60) {
            System.out.println("Sua alíquota será de 15% com valor de R$ 354,80");
        } else if (rendAnual >= 45012.61 && rendAnual <= 55976.16) {
            System.out.println("Sua alíquota será de 22,5% com valor de R$ 636,13");
        } else {
            System.out.println("Sua alíquota será de 25% com valor de R$ 702,50");
        }
        System.out.println("---------------------------------------");
        System.out.println("FIM");
    }
}
