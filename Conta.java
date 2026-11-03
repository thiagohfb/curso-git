/**
 * Conta
 */
public class Conta {
    String numeroConta;
    double saldo;

    public static void main(String[] args) {
        System.out.println("Iniciando Classe");
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
        System.out.println("testes");
        return ;
    }
}