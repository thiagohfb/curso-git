/**
 * Conta
 */
public class Conta {
    String numeroConta;
    double saldo;

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
        return ;
    }
}