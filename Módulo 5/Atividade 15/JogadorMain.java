import java.util.ArrayList;
import java.util.Date;

public class JogadorMain {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
            jogadores.add(new Jogador(1, "Neymar da Silva SantosJr", "Neymar", new Date(5/2/92), 10, "atacante", 100, 3, true));
            jogadores.add(new Jogador(2, "Alessandro Beti Rosa", "Magrão", new Date(9/4/77), 1, "goleiro", 100, 0, false));
            jogadores.add(new Jogador(3, "Diego Souza", "Diego Souza", new Date(17/6/85), 87, "meio de campo", 100, 0, false));
            jogadores.add(new Jogador(4, "Pedro Gulherme Abreu dos Sntos", "Pedro", new Date(20/6/97), 9, "centro avante", 100, 2, false));
            jogadores.add(new Jogador(5, "Mikael Felipe Viana de Souza", "Mikael", new Date(28/5/99), 99, "atacante", 100, 0, false));
            jogadores.add(new Jogador(6, "Mailson Tenório dos Santos", "Mailson", new Date(20/8/96), 2, "goleiro", 100, 1, false));
            jogadores.add(new Jogador(7, "Cristiano Ronaldo dos Santos Aveiro", "Cristiano Ronaldo", new Date(5/2/84), 7, "extremo esquerdo", 100, 0, false));
            jogadores.add(new Jogador(8, "Henrique Bortolotto", "Sander", new Date(3/10/90), 12, "lateral esquerdo", 100, 0, false));
            jogadores.add(new Jogador(9, "Givanildo Vieira de Souza", "Hulk", new Date(25/7/86), 8, "centro avante", 100, 0, false));
            jogadores.add(new Jogador(10, "Diego da Silva Costa", "Diego Costa", new Date(7/10/88), 9, "centro avante", 100, 0, false));
            jogadores.add(new Jogador(11, "Joelinton Cassio Apolinário de Lima", "Joelinton", new Date(14/8/96), 9, "centro avante", 100, 0, false));
           
        jogadores.ExibirTime();
    }
}