package Exercicios.Clinica2;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public List<Cliente> listaClientes = new ArrayList<>();

    String donoClinica;

    public void categorizarClientes(){
        List<Cliente> muitoMagro = new ArrayList<>();
        List<Cliente> normal = new ArrayList<>();
        List<Cliente> sobrepeso = new ArrayList<>();
        List<Cliente> obesoGrauI = new ArrayList<>();
        List<Cliente> obesoGrauII = new ArrayList<>();
        List<Cliente> obesoGrauIIIMorbido = new ArrayList<>();

        for(Cliente cliente : listaClientes){
            switch (cliente.IMC()){
                case "Muito Magro":
                    muitoMagro.add(cliente);
                    break;
                case "Normal":
                    normal.add(cliente);
                    break;
                case "Sobrepeso":
                    sobrepeso.add(cliente);
                    break;
                case "Obeso grau I":
                    obesoGrauI.add(cliente);
                    break;
                case "Obeso grau II":
                    obesoGrauII.add(cliente);
                    break;
                case "Obeso grau III ou Mórbido":
                    obesoGrauIIIMorbido.add(cliente);
                    break;
            }


            //Parei aqui - está imprimindo várias vezes a mesma coisa...entender isso
            // Continuar a partir do ex 04
            System.out.println("---------------\nLista Muito Magro");
            muitoMagro.forEach(c-> System.out.println(c.nome));
            System.out.println("---------------\nLista Normal");
            normal.forEach(c-> System.out.println("Normal: "+c.nome));
            System.out.println("---------------\nLista Sobrepeso");
            sobrepeso.forEach(c-> System.out.println("Sobrepeso: "+c.nome));
            System.out.println("---------------\nLista Obeso Grau I");
            obesoGrauI.forEach(c-> System.out.println("Obeso Grau I: "+c.nome));
            System.out.println("---------------\nLista Obeso Grau II");
            obesoGrauII.forEach(c-> System.out.println("Obeso Grau II: "+c.nome));
            System.out.println("---------------\nLista Obeso Grau III ou Mórbido");
            obesoGrauIIIMorbido.forEach(c-> System.out.println("Obeso Grau III ou Mórbido: "+c.nome));
        }
    }
}