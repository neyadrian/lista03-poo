package NomesIguais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1, nome2;

        System.out.print("Digite o nome 1: ");
        nome1 = sc.nextLine();
        System.out.print("Digite o nome 2: ");
        nome2 = sc.nextLine();

        nome1 = nome1.toLowerCase();
        nome2 = nome2.toLowerCase();

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais.");
        } else {
            System.out.println("Os nomes não são iguais.");
        }

        sc.close();
    }
}
