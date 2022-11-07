//Crie uma lista de nomes com Array List e salve
// nomes incluidos pelo usuário até receber a
// palavra "fim", a inclusão de nomes deve ser
// feita através do loop Do While.Os nomes da lista
// devem ser ordenados em ordem alfabética e exibidos
// na tela um a um.

import java.util.ArrayList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex06_OrdenandoNomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<>();
        String continuar = "";
        do {
            System.out.println("Insira um novo nome na lista: (digite 'fim' para finalizar a aplicacao)");
            String adiciona = in.next();
            if(!Objects.equals(adiciona, "fim")){
                listaDeNomes.add(adiciona);
            }else {
                continuar = adiciona;
            }
        }while (!Objects.equals(continuar, "fim"));


        PriorityQueue<String> listaOrdenada = new PriorityQueue<>(listaDeNomes);

        System.out.println("******* Lista de nomes ordenada *******");
        listaOrdenada.forEach(item -> {
            System.out.println(item);
        });
    }
}