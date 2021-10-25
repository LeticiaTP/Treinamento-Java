import java.lang.module.ResolutionException;
import java.util.List;

public class Movie {
    public String titulo;
    public int duracao;
    public String diretor;
    public int anoLancamento;

    public Movie(String titulo, int duracao, String diretor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public String GetTitulo() {
        return titulo;
    }

    public String GetDiretor() {
        return diretor;
    }

    public int GetDuracao() {
        return duracao;
    }

    public int GetAnoLancamento() {
        return anoLancamento;
    }

}
