import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    @Test
    public void testUsuarioCreation() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
        assertTrue(usuario.getHistoricoEmprestimos().isEmpty());
    }

    @Test
    public void testAdicionarEmprestimo() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Autor autor = new Autor("Alan Turing", 41);
        Livro livro = new Livro("Java Basics", "Tecnologia", autor);
        Emprestimo emprestimo = new Emprestimo(usuario, livro, new Date(), new Date());

        usuario.adicionarEmprestimo(emprestimo);

        assertEquals(1, usuario.getHistoricoEmprestimos().size());
        assertEquals(emprestimo, usuario.getHistoricoEmprestimos().get(0));
    }
}
