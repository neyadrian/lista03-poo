package CaixaDagua;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double lado;
        double volume;

        System.out.print("Digite o valor do lado da caixa D'água: ");
        lado = sc.nextDouble();

        volume = Math.pow(lado, 3);
        volume = Math.floor(volume);

        System.out.printf("Valor do volume: %.2f\n", volume);

        sc.close();
    }
}
