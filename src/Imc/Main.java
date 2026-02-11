package Imc;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, altura, peso);

        System.out.printf("\n%s o seu IMC é %.2f e a sua classificaçã é ", pessoa.nome, pessoa.calculoImc());

        if (pessoa.calculoImc() < 18.5) {
            System.out.print("Magreza");
        } else if (pessoa.calculoImc() >= 18.5 && pessoa.calculoImc() <= 24.9) {
            System.out.print("Normal");
        } else if (pessoa.calculoImc() >= 25 && pessoa.calculoImc() <= 29.9) {
            System.out.print("Sobrepeso");
        } else if (pessoa.calculoImc() >= 30 && pessoa.calculoImc() <= 34.9) {
            System.out.print("Obesidade grau I");
        } else if (pessoa.calculoImc() >= 35 && pessoa.calculoImc() <= 39.9) {
            System.out.print("Obesidade grau II");
        } else {
            System.out.print("Obesidade grau III");
        }

        sc.close();
    }
}
