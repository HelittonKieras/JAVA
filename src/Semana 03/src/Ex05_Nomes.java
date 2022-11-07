import java.util.Scanner;

public class Ex05_Nomes {
    public static void main(String[] args) {
        String[] nomes = new String[10];

        //loop para receber 10 nomes
        for (int i = 0; i < 10; i++){
            Scanner scanner = new Scanner(System.in);
            nomes[i] = scanner.nextLine();
        }
        //loop para imprimir os 10 nomes
        for (int i = 0; i < 10; i++){
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Posição: " + i);
        }
    }
}