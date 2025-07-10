public class Main_Conta {
    public static void main(String[] args) {

        Conta_Bancaria c1 = new Conta_Bancaria();

        c1.setNumeroConta("56.4859879");
        c1.depositar(52);

        System.out.printf("O Saldo da conta %s é R$ %.2f",c1.getNumeroConta(),c1.getSaldo());

        System.out.println("");

        c1.sacar(36);
        System.out.printf("O Saldo da conta %s é R$ %.2f",c1.getNumeroConta(),c1.getSaldo());

        System.out.println("");
        c1.sacar(17);
        System.out.printf("O Saldo da conta %s é R$ %.2f",c1.getNumeroConta(),c1.getSaldo());

        System.out.println("");
        c1.sacar(17);



    }
}
