import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> obrasPublicadas;

    public Autor(String nome, int idade) {
        super(nome, idade);
        this.obrasPublicadas = new ArrayList<>();
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }
}