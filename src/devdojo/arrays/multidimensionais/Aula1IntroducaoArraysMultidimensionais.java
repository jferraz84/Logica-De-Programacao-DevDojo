package devdojo.arrays.multidimensionais;

public class Aula1IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {

        int[][] arraysMult1 = new int[2][2];
        arraysMult1[0][0] = 22;
        arraysMult1[0][1] = 11;
        arraysMult1[1][0] = 44;
        arraysMult1[1][1] = 55;

        System.out.println("Resultado: " +arraysMult1[0][0]);
        System.out.println("Resultado: " +arraysMult1[0][1]);
        System.out.println("Resultado: " +arraysMult1[1][0]);
        System.out.println("Resultado: " +arraysMult1[1][1]);

        System.out.println("==================================");
        System.out.println("*****    FIM do Programa     *****");
        System.out.println("==================================");

    }
}
