import java.util.ArrayList;

public class Livro(){

    private String nome;
    private String autor;
    private String categoria;
    private ArrayList<Livro> categorias;

    public Livro(String nome, String autor, String categoria) {
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

   
    public List<livro> getCategorias() {
        return categorias;
    }
}
