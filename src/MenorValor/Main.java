package MenorValor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = sc.nextInt();

        int menor = Math.min(x, y);

        if (menor == x) {
            System.out.printf("%d é menor que %d.\n", x, y);
        } else {
            System.out.printf("%d é menor que %d.\n", y, x);
        }

        sc.close();
    }
}
