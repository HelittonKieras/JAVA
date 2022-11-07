import java.util.Scanner;

public class Ex03_CalculadoraLoop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner oper = new Scanner(System.in);
        double num1, num2, resultado = 0;
        String operacao;

        do {
            System.out.println("Digite um número: ");
            num1 = entrada.nextDouble();
            System.out.println("Digite outro número: ");
            num2 = entrada.nextDouble();
            System.out.println("Selecione o número referente à operação desejada: \n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão\n" +
                    "5 - Fim");
            operacao = oper.nextLine();

            switch (operacao) {
                case "1":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "2":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "3":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "4":
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Calculadora desligada");
                    break;
            }
        }while(!operacao.equals("5"));
    }
}