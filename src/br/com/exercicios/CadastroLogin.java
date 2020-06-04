package br.com.exercicios;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Login: ");
        String login = sc.next();


        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")){
                System.out.println("Usuário Inválido !!!");
            } else {
                System.out.println("Usuário cadastrado com sucesso");
            }

        }

}
