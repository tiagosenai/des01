import java.time.LocalDate;

public class Livro {
    private int Id;
    private String titulo;
    private String autor;
    private String editora;
    private String isbn;
    private LocalDate ano_publicacao;
    private int qtde_capitulos;
    private String resumo;
    
    public Livro(int id, String titulo, String autor, String editora, String isbn, LocalDate ano_publicacao,
            int qtde_capitulos, String resumo) {
        Id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano_publicacao = ano_publicacao;
        this.qtde_capitulos = qtde_capitulos;
        this.resumo = resumo;
    }
 
    @Override
    public String toString() {
        return "Livro [Id=" + Id + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", isbn=" + isbn
                + ", ano_publicacao=" + ano_publicacao + ", qtde_capitulos=" + qtde_capitulos + ", resumo=" + resumo
                + "]";
    }    
}


