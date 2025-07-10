public class Main_Aluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setNome("Victor Matheus");
        a1.setNota1(8.0);
        a1.setNota2(5.0);

        Aluno a2 = new Aluno();
        a2.setNome("Mariana Pereira");
        a2.setNota1(7.5);
        a2.setNota2(4.5);

        Aluno a3 = new Aluno();
        a3.setNome("Gustavo Feliciano");
        a3.setNota1(4.0);
        a3.setNota2(5.5);

        System.out.println(a1.getNome() + ": Média " + a1.getMedia() + " - " + (a1.isAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println(a2.getNome() + ": Média " + a2.getMedia() + " - " + (a2.isAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println(a3.getNome() + ": Média " + a3.getMedia() + " - " + (a3.isAprovado() ? "Aprovado" : "Reprovado"));
    }
}