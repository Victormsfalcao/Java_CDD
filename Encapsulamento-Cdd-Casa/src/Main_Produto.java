public class Main_Produto {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setNome("Arroz");

        System.out.println(p1.getQuantidadeEstoque());
        p1.adicionarEstoque(15);
        System.out.println(p1.getQuantidadeEstoque());
        p1.removerEstoque(5);
        System.out.printf("O estoque do produto %s é de %d unidades",p1.getNome(),p1.getQuantidadeEstoque());

    }
}
