package Arredondar1;

public class Main {
    public static void main(String[] args) {

        double num1 = 5.2;
        double num2 = 5.6;
        double num3 = -5.8;

        System.out.println("Numeros originais:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("Numeros arredondados para o inteiro mais próximo:");
        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));
        System.out.println(Math.round(num3));

    }
}
