package br.com.exercicios;

public class CalcularImposto {
    public static void main(String[] args) {

        float salary = 2500.00F;
        float porcentagem = 30F;
        float resultImpostoSalary = (salary * porcentagem) / 100;

        System.out.println(resultImpostoSalary);

    }
}
