package Imc;

public class Pessoa {

    public String nome;
    public double altura;
    public double peso;

    public Pessoa (String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculoImc () {
        return peso / (altura * altura);
    }

}