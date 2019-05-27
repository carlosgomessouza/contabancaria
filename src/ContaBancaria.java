public class ContaBancaria {

    String NomeDoCliente;
    int numero;
    double saldo = 100.0;

    public void sacar(double valor) {
        
        if (valor <= this.saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("O saque não poderá ser efetuado, saldo insuficiente!");
        }

    }

    public void depositar(double valor) {

        if (valor > 0) {
            System.out.println("Depositio de " + valor + " efetuado com sucesso!");
        } else {
            System.out.println("Problemas ao efetuar o deposito!");
        }

    }

}
