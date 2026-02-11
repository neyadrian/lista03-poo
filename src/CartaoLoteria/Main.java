package CartaoLoteria;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        for (int cartao = 1; cartao <= 5; cartao++) {
            System.out.print("Cartão " + cartao + ": ");

            int[] numeros = new int[6];
            int i = 0;

            while (i < 6) {
                int numero = random.nextInt(60) + 1;
                boolean repetido = false;

                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    numeros[i] = numero;
                    i++;
                }
            }

            for (int n : numeros) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
