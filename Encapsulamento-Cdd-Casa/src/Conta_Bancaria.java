public class Conta_Bancaria {
    private String numeroConta;
    private double saldo;


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.print("Não foi possivel depositar");
        }
        else{
            saldo += valor;
        }
    }
    public void sacar (double valor) {
        if (saldo <= 0){
            System.out.print("Não foi possível sacar");
        }
       else{
           saldo -= valor;
        }
    }



}
