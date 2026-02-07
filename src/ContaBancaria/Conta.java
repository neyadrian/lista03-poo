package ContaBancaria;

public class Conta {

    public String nomeTitular;
    public int numeroConta;
    public double saldo;

    public Conta(String nomeTitular, int  numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double depositar() {
        return 0;
    }

    public double sacar() {
        return 0;
    }
}
