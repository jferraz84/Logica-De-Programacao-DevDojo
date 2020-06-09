package devdojo.exercicios;

import java.util.Scanner;

public class DesafioCalculoMediaComArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("==================================");
        System.out.println("***** calculando Média Aluno *****");
        System.out.println("==================================");
        System.out.println("O resultado = APROVADO / REPROVADO");

        double soma = 0;
        int desejaContinuar = 1;

        do {
            System.out.println("==================================");
            System.out.print("Digite o nome do Aluno: ");
            String nome = sc.next();

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite sua " + (i + 1) + "° nota: ");
                notas[i] = sc.nextDouble();
                soma = soma + notas[i];
                System.out.println("----------------------------------");
            }

            double media = soma / 4;
            System.out.println();
            if (media < 4) {
                System.out.println("O Aluno " + nome.toUpperCase() + ", com média " +media+ " está REPROVADO !");
            } else if (media >= 4 && media < 6) {
                System.out.println("O Aluno " + nome.toUpperCase() + ", com média " +media+ " ainda tem um chance, basta fazer a REPROVA !!");
            } else {
                System.out.println("O Aluno " + nome.toUpperCase() + ", com média " +media+ " está APROVADO !!");

            }
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("Deseja Calcular outras Médias ");
            System.out.println("1: Sim");
            System.out.println("2: Não");
            System.out.print("R: ");
            desejaContinuar = sc.nextInt();
        } while (desejaContinuar == 1);

        System.out.println("==================================");
        System.out.println("*****    FIM do Programa     *****");
        System.out.println("==================================");
    }
}
