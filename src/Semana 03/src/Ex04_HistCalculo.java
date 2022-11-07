import java.util.Scanner;
import java.util.ArrayList;

public class Ex04_HistCalculo {
    public static void main(String[] args) {
        String operacao = "working";
        while (!operacao.equals("fim")){

            //Entrada para receber os números
            Scanner entrada = new Scanner(System.in);
            Scanner operacaoin = new Scanner(System.in);
            double num1, num2, resultado = 0;

            System.out.println("Digite um número: ");
            num1 = entrada.nextDouble();
            System.out.println("Digite outro número: ");
            num2 = entrada.nextDouble();

            System.out.println("Selecione o número referente à operação: \n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
//            operacao =

            //Entrada para receber a operação
            Scanner entrada2 = new Scanner(System.in);
            operacao = entrada2.nextLine();

            switch (operacao) {
                case "soma":
                    resultado = num1 + num2;
                    break;
                case "subtracao":
                    resultado = num1 - num2;
                    break;
                case "multiplicacao":
                    resultado = num1 * num2;
                    break;
                case "divisao":
                    resultado = num1 / num2;
                    break;
        case "'Fim":
                    System.out.println("Fim de operação");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
            System.out.println(resultado);
        }while(!operacao.equals("Fim"));
    }
}