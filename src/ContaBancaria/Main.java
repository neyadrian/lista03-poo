package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;
        double valor;

        System.out.println("-- DIGITE OS DADOS DA CONTA --");
        System.out.print("Nome: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();

        Conta conta = new Conta(nomeTitular, numeroConta);

        do {

            System.out.println("-- MENU DE TRANSAÇÕES --");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Finalizar");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Digite o valor para depósito: R$ ");
                valor = sc.nextDouble();
                conta.depositar(valor);
                System.out.printf("Depósito Efetuado com Sucesso, saldo atual: R$ %.2f\n", conta.saldo);
            } else if (op == 2) {
                System.out.print("Digite o valor para saque: ");
                valor = sc.nextDouble();
                if (conta.sacar(valor)) {
                    System.out.printf("Saque Efetuado com Sucesso, saldo atual: R$ %.2f\n", conta.saldo);
                } else {
                    System.out.println("Saque não Efetuado, Saldo Insuficiente.");
                }
            } else if (op == 3) {
                System.out.printf("Seu Saldo atual é de: R$ %.2f\n", conta.saldo);
            }

        } while (op == 0);

        System.out.println("Operação Finalizada!");
        sc.close();
    }
}
