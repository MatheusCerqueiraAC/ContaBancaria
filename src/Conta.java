public class Conta {

    String nome;
    String tipoConta;
    double saldoInicial;

    public void consultaSaldo() {
        System.out.println("O seu saldo é: " + saldoInicial);
    }

    public double depositar(double valor) {
        return saldoInicial += valor;
    }

    public double transfere(double valor) {
            return saldoInicial -= valor;
    }

}
