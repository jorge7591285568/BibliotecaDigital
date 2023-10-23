import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = (" Java 2 ");
        livro.categoria = (" Tecnico: programacao ");
        livro.autor = (" Jorge ");

        Livro livro1 = new Livro();
        livro1.nome = (" Java 10 ");
        livro1.categoria = (" Ficcao: programacao orientada a objeto ");
        livro1.autor = (" Jorge1 ");

        System.out.println(" O nome do livro é: " + livro.nome + " sua Categoria é: " + livro.categoria
                + "seu Autor é: " + livro.autor);
        System.out.println(" O nome do livro é: " + livro1.nome + " sua Categoria é: " + livro1.categoria
                + "seu Autor é: " + livro1.autor);
        System.out.println(" tipo  categoria: " + livro.categoria);
        System.out.println(" tipo  categoria: " + livro1.categoria);
    }
}
