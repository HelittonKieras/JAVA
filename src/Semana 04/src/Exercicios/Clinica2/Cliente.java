package Exercicios.Clinica2;

public class Cliente {
    String nome;
    Double peso;
    Double altura;
    Integer idade;

    public String IMC(){
        Double resultado = peso/(altura*altura);

        if(resultado < 18.5){
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Muito Magro");
        }else if(resultado > 18.5 && resultado < 24.9){
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Normal");
        }else if(resultado > 25 && resultado < 29.9){
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Sobrepeso");
        }else if(resultado > 30 && resultado < 34.9){
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Obeso grau I");
        }else if(resultado > 35 && resultado < 39.9){
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Obeso grau II");
        }else{
//            System.out.println("Cliente: "+nome);
//            System.out.println("IMC: "+ String.format("%.2f", resultado));
            return ("Obeso grau III ou Mórbido");
        }
    }
}
