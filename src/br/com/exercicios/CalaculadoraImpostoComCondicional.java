package br.com.exercicios;

public class CalaculadoraImpostoComCondicional {
    public static void main(String[] args) {

        float salary = 3700.50F;
        float result = 0F;

        if (salary > 4500){
            result = salary * 0.8F;
            System.out.println("O imposto descontado será de: " + result + " equivalente a 8%");
        } else {
            result = salary * 0.4F;
            System.out.println("O imposto descontado será de: " + result + " equivalente a 4.5%");
        }
    }
}
