package devdojo.lacosderepeticao.fors;

public class Aula3NovaTabuada {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Imprimindo as tabuadas de 2 a 10");
        System.out.println("================================");


        for (int i = 2; i <= 10 ; i++) {
            System.out.println("-----------------");
            System.out.println("Tabuada do : " + i);
            System.out.println("-----------------");

            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+ " X " +j+" = " + (i * j));

            }

        }
    }
}
