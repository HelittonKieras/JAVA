//Crie um programa que receba 2 dados escritos pelo usuário e
// realize uma soma entre esses número e exiba o resultado no terminal.

import java.util.Scanner;

public class  Ex01_Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = entrada.nextDouble();

        resultado = num1 + num2;

        System.out.println("O resultado da soma é: " + resultado);
    }
}
