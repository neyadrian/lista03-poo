package CaixaDagua;

import java.util.Scanner;

/*
Crie uma classe que calcule quantos metros cúbicos de água suporta
uma determinada caixa-d’água em forma de cubo (todos os lados são iguais).
O usuário deverá informar o valor do lado e o volume será calculado pela
fórmula: Volume = lado³. Arredonde o resultado para o seu inteiro anterior.
*/

public class Main {
    public static void main(String[] args) {

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
