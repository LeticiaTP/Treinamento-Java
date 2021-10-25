import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Movies {
    private List<Movie> filme = new ArrayList<>();

    public String GetMovies() {
        return ((Movie) filme.stream()).GetTitulo();
    }

    public long GetQtdMovies() {
        return filme.stream().count();
    }

    public long GetKubrickMovies() {
        return filme.stream().filter(f -> f.GetDiretor() == "Stanley Kubrick").count();
    }

    public String GetMovieSmallerThan100() {
        if (filme.stream().filter(d -> d.duracao < 100 ) != null) {
            return ((Movie) filme.stream()).GetTitulo();
        };
        return null;
    }

    public String GetMovieDirector(String diretor) {
        if (filme.stream().filter(f -> f.diretor == diretor) != null) {
            return ((Movie) filme.stream()).GetTitulo();
        } 
        return null;
    }

    public void GetLongestMovie() {
        ((Movie) filme.stream().sorted(Comparator.comparing(Movie::GetDuracao))).GetTitulo();
    }

    public void GetSmallestMovie() {
        ((Comparator) filme.stream().sorted(Comparator.comparing(Movie::GetDuracao))).reversed();
    }

    public void OrderByMovieRelease() {
        filme.stream().sorted(Comparator.comparing(Movie::GetAnoLancamento)).forEach(person -> System.out.println(((Movie) filme).GetTitulo()));
    }
    
}