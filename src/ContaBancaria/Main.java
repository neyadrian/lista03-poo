package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-- DIGITE OS DADOS DA CONTA --");
        System.out.print("Nome: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();

        Conta conta = new Conta(nomeTitular, numeroConta);

        sc.close();
    }
}
