package br.com.exercicios;

public class VerificaIdade {
    public static void main(String[] args) {

        int idade = 16;
        String nome = "Jorge";

        if (idade > 18) {
            System.out.println("O nome do usuario é " + nome + " é adulto com " + idade + " anos");
        } else {
            System.out.println("O nome do usuario é " + nome + " e ele não é adulto com " + idade + " anos");
        }

        System.out.println("FIM");
    }


}
