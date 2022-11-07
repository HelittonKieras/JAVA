//Crie um programa que gera um exception sempre que executado, pegue essa
// exception em um Catch e print a mensagem de erro.

public class Ex07_Throws {
    public static void main(String[] args) {
        try {
//            throw new Exception();
            int a = 0;
            int b = a / a;
        } catch (Exception e) {
            System.out.println("Error message " + e.getMessage());
        }
    }
}