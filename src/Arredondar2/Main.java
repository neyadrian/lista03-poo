package Arredondar2;

public class Main {
    public static void main(String[] args) {

        double num1 = 5.2;
        double num2 = 5.6;
        double num3 = -5.8;

        System.out.println("Numeros originais:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("Numeros arredondados para o inteiro anterior:");
        System.out.println(Math.floor(num1));
        System.out.println(Math.floor(num2));
        System.out.println(Math.floor(num3));

    }
}
