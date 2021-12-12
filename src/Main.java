import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crie um programa que receba dois valores do usuário
        //e exiba a o resultado de sua divisão;

        Scanner scr = new Scanner(System.in);

        int valor1;
        int valor2;
        double divisao;

        System.out.print("informe o valor1\n");
        valor1 = scr.nextInt();

        System.out.print("informe o valor2\n");
        valor2 = scr.nextInt();

        divisao = (double) valor1 / valor2;

        System.out.print("resultado da divisao é\n");

        System.out.println(divisao);


    }
}
