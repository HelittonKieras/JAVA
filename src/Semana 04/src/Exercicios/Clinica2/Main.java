package Exercicios.Clinica2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Silas";
        cliente1.peso = 83.2;
        cliente1.altura = 1.78;
        cliente1.idade = 32;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Izabela";
        cliente2.peso = 63.1;
        cliente2.altura = 1.65;
        cliente2.idade = 29;

        Cliente cliente3 = new Cliente();
        cliente3.nome = "Mario";
        cliente3.peso = 120.1;
        cliente3.altura = 1.78;
        cliente3.idade = 51;

        Cliente cliente4 = new Cliente();
        cliente4.nome = "Luigi";
        cliente4.peso = 49d;
        cliente4.altura = 1.65;
        cliente4.idade = 22;

//        System.out.println(cliente.IMC());
//        System.out.println(cliente2.IMC());

        Clinica clinica = new Clinica();
        clinica.listaClientes.add(cliente1);
        clinica.listaClientes.add(cliente2);
        clinica.listaClientes.add(cliente3);
        clinica.listaClientes.add(cliente4);

        clinica.categorizarClientes();
    }
}