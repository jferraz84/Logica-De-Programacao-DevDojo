package br.com.exercicios;

public class CalcularImposto {
    public static void main(String[] args) {

        float salary = 3000.00F;
        float porcentagem = 9F;
        float resultImpostoSalary = (salary * porcentagem) / 100;

        System.out.println("O valor do imposto cobrado em cima do salario de R$ "+ salary + " é de " +resultImpostoSalary);

    }
}
