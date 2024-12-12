import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o autor
        Autor autor = new Autor("Jessica Felix", 35);

        // Criando o livro
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);
        autor.adicionarObra(livro);

        // Criando o usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Realizando o empréstimo
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataAtual, dataAtual);

        // Exibindo os detalhes do empréstimo
        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}
