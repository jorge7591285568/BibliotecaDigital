import java.util.ArrayList;

public class Livro(){

    public String nome;
    public String autor;
    public String categoria;
    public ArrayList<livro> Categorias();
    
    /*public String getNome;
    public String getCategoria;
    public String getAutor;*/
    
    public Livro(String nome, String autor, String categoria) {
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
    }
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }
     public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }
     public void  setAutor(String autor) {
        this.autor = autor;
    }
   
    public ArrayList<Livro> getCategorias() {
        return  categorias;
    }
     public ArrayList<Livro> setCategorias() {
        this.categorias =  categorias;
    }
}
