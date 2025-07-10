public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int qtd){
        quantidadeEstoque = qtd + quantidadeEstoque;
    }

    public void removerEstoque(int qtd){
        if (quantidadeEstoque < 0 ){
            System.out.print("Não foi possivel remover");
        }
        quantidadeEstoque = quantidadeEstoque - qtd;
    }



}
