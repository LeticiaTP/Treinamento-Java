import java.util.Date;
import java.util.Random;

public class Jogador {
    public int id;
    public String nome;
    public String apelido;
    public Date dataNascimento;
    public int numero;
    public String posicao;
    public int qualidade;
    public int cartoes;
    public Boolean suspenso;

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, 
                    String posicao, int qualidade, int cartoes, Boolean suspenso) {

        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    

    public void ExibirTime()  {
        String condicao = "";
        if (suspenso == true) {
            condicao = "Suspenso.";
        } else {
            condicao = "Tá pra jogo!";
        }
        
        for (int i = 0 ;  i <= 11 ; i++) {
            System.out.println(posicao + ": " + numero + " " + "(" + apelido + ")" + " - " + dataNascimento + " Condição:" + condicao) ;
        }
    }

    public Boolean ExibirCondicao() {
        if (cartoes < 3) {
            if (suspenso == false) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int AplicarCartao(int quantidade) {
        quantidade = quantidade + cartoes;

        if (cartoes >= 3) {
            suspenso = true;
            System.out.println("O jogador foi suspenso! Quantidade de cartões: ");
            return cartoes;
        } else {
            System.out.println("Quantidade de cartões do jogador: ");
            return cartoes;
        }
    }

    public void CumprirSuspencao() {
        cartoes = 0;
        suspenso = false;
    }

    public void SofrerLesao() {
        Random random = new Random();
        int lesao = random.nextInt(100);

        if (lesao <= 5)
        {
            qualidade = qualidade - ((15 * qualidade) / 100);
        }
        if (lesao > 5 && lesao <= 10) 
        {
            qualidade = qualidade - ((10 * qualidade) / 100);
        }
        if (lesao > 10 && lesao <= 15) 
        {
            qualidade = qualidade - ((5 * qualidade) / 100);
        }
        if (lesao > 15 && lesao <= 30) 
        {
            qualidade = qualidade - 2;
        }
        if (lesao > 30 && lesao <= 40) 
        {
            qualidade = qualidade - 1;
        }

        if (qualidade < 1) {
            qualidade = 0;
        }
    }

    Boolean treinou;
    public void ExecutarTreinamento() {

        if (treinou == false) {
            if (qualidade <= 5)
            {
                qualidade = qualidade + 5;
            }
            if (qualidade > 5 && qualidade <= 10) 
            {
                qualidade = qualidade + 4;
            }
            if (qualidade > 10 && qualidade <= 15) 
            {
                qualidade = qualidade + 3;
            }
            if (qualidade > 15 && qualidade <= 30) 
            {
                qualidade = qualidade + 2;
            }
            if (qualidade > 30 && qualidade <= 40) 
            {
                qualidade = qualidade + 1;
            }
        } else {
            System.out.println("Esse jogador já treinou!");
        }

        if (qualidade > 100) {
            qualidade  = 100;
        }

        treinou = true;
    }
}