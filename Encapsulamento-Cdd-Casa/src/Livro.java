public class Livro {

    private String titulo;
    private String autor;
    private int faixaEtariaMinima;

    public Livro(String titulo, String autor, int faixaEtariaMinima) {
        this.titulo = titulo;
        this.autor = autor;
        this.faixaEtariaMinima = faixaEtariaMinima;
    }

    public boolean podeSerLidoPor(int idadeLeitor) {
        if (idadeLeitor >= faixaEtariaMinima) {
            return true;
        } else {
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}