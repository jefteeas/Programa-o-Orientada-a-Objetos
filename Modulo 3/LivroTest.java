import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    @Test
    public void testLivroCreation() {
        Autor autor = new Autor("Jess", 40);
        Livro livro = new Livro("Java Basico", "tecnologia", autor);

        assertEquals("Java Basico", livro.getTitulo());
        assertEquals("tecnologia", livro.getGenero());
        assertEquals(autor, livro.getAutor());
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testAtualizarDisponibilidade() {
        Autor autor = new Autor("Jess", 40);
        Livro livro = new Livro("Java Basico", "tecnologia", autor);

        livro.setDisponivel(false);
        assertFalse(livro.isDisponivel());

        livro.setDisponivel(true);
        assertTrue(livro.isDisponivel());
    }
}
