import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {
    @Test
    public void testEmprestimoCreation() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Autor autor = new Autor("Alan Turing", 41);
        Livro livro = new Livro("Java Basics", "Tecnologia", autor);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataRetirada, dataDevolucao);

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertFalse(livro.isDisponivel());
    }
}
