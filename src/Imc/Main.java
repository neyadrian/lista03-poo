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

        System.out.println(pessoa.calculoImc());

        sc.close();
    }
}
