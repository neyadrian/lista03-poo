package MaiusculoMinusculo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase, maiusculo, minusculo;

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();

        maiusculo = frase.toUpperCase();
        minusculo = frase.toLowerCase();

        System.out.println(maiusculo);
        System.out.println(minusculo);

        sc.close();
    }
}
