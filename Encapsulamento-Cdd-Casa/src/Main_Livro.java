public class Main_Livro{
    public static void main(String[] args) {

        Livro maus = new Livro("MAUS", "Art Spiegelman", 14); // Exemplo de faixa etária
        Livro scottPilgrim = new Livro("Scott Pilgrim vs. The World", "Bryan Lee O'Malley", 12); // Exemplo de faixa etária
        Livro repeteco = new Livro("Repeteco", "Vários Autores", 10); // Exemplo de faixa etária

        int idadeCrianca = 9;
        int idadeAdolescente = 15;
        int idadeJovemAdulto = 20;

        System.out.println("Teste com o livro " + maus.getTitulo());
        System.out.println("Idade " + idadeCrianca + ": Pode ler? " + maus.podeSerLidoPor(idadeCrianca));
        System.out.println("Idade " + idadeAdolescente + ": Pode ler? " + maus.podeSerLidoPor(idadeAdolescente));

        System.out.println("");

        System.out.println("Teste com o livro " + scottPilgrim.getTitulo());
        System.out.println("Idade " + idadeCrianca + ": Pode ler? " + scottPilgrim.podeSerLidoPor(idadeCrianca));
        System.out.println("Idade " + idadeJovemAdulto + ": Pode ler? " + scottPilgrim.podeSerLidoPor(idadeJovemAdulto));

        System.out.println("");

        System.out.println("Teste com o livro" + repeteco.getTitulo() );
        System.out.println("Idade " + idadeCrianca + ": Pode ler? " + repeteco.podeSerLidoPor(idadeCrianca));
        System.out.println("Idade " + idadeAdolescente + ": Pode ler? " + repeteco.podeSerLidoPor(idadeAdolescente));
    }
}