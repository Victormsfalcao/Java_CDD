public class Main_Pessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.setNome("Victor");
        p1.setIdade(19);

        System.out.printf("Meu nome é %s e tenho %d anos",p1.getNome(),p1.getIdade());
    }
}
