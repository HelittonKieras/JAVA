package Exercicios.Clinica;

//Vamos criar um sistema para uma Clinica de Emagrecimento.
//Crie uma classe Cliente que contenha os atributos peso,
// altura e idade.


//Ex 1
public class Cliente {
    private String nome;
    private Double peso;
    private Double altura;
    private Integer idade;

    //Ex 4
    public Cliente(){};

    public Cliente(String nome, Double peso, Double altura, Integer idade){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    //Ex 7
    public Cliente(Double peso, Double altura){
        this.peso = peso;
        this.altura = altura;
    }


    //Ex 2

    //Métodos
    public String IMC() {
        Double resultado = peso / (altura * altura);

        if (resultado < 18.5) {
            System.out.println("Seu IMC é: " + resultado);
            return "Muito magro";
        } else if (resultado > 18.5 && resultado < 24.9) {
            System.out.println("Seu IMC é: " + resultado);
            return "Normal";
        } else if (resultado > 25.5 && resultado < 29.9) {
            System.out.println("Seu IMC é: " + resultado);
            return "Sobrepeso";
        } else if (resultado > 30.0 && resultado < 34.9) {
            System.out.println("Seu IMC é: " + resultado);
            return "Obeso grau I";
        } else if (resultado > 35.0 && resultado < 39.9) {
            System.out.println("Seu IMC é: " + resultado);
            return "Obeso grau II";
        } else {
            System.out.println("Seu IMC é: " + resultado);
            return "Obeso grau III ou Mórbido";
        }
    }

    //parte do Ex 4

    //getters
    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}