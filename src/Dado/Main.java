package Dado;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int resultado;

        for (int i = 1; i <= 10; i++) {
            resultado = random.nextInt(6) + 1; // gera número de 1 a 6
            System.out.printf("Jogada %d: %d\n", i, resultado);
        }
    }
}
