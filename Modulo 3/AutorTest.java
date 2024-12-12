import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    @Test
    public void testAutorCreation() {
        Autor autor = new Autor("Jess", 40);

        assertEquals("Jess", autor.getNome());
        assertEquals(40, autor.getIdade());
        assertTrue(autor.getObrasPublicadas().isEmpty());
    }

    @Test
    public void testAdicionarObra() {
        Autor autor = new Autor("Jess", 40);
        Livro livro = new Livro("Java Basico", "tecnologia", autor);

        autor.adicionarObra(livro);

        assertEquals(1, autor.getObrasPublicadas().size());
        assertEquals(livro, autor.getObrasPublicadas().get(0));
    }
}
