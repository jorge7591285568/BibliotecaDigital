
public class Biblioteca {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = (" Java 2 ");
        livro.categoria = (" programacao ");
        livro.autor = (" Jorge ");

        Livro livro1 = new Livro();
        livro1.nome = (" Java 10 ");
        livro1.categoria = (" programacao orientada a objeto ");
        livro1.autor = (" Jorge1 ");
        
        System.out.println(" O nome do livro é: " + livro.getNome + " sua Categoria é: " + livro.getCategoria
                + "seu Autor é: " + livro.getAutor);
        System.out.println(" O nome do livro é: " + livro.getNome + " sua Categoria é: " + livro.getCategoria
                + "seu Autor é: " + livro.getAutor);
    }
}
