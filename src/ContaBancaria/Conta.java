package ContaBancaria;

public class Conta {

    public String nomeTitular;
    public int numeroConta;
    public double saldo;

    public Conta(String nomeTitular, int  numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
            return (true);
        } else {
            return false;
        }
    }

}
