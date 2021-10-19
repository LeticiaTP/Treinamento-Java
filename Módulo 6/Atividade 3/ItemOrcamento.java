public class ItemOrcamento {
    public String historico;
    public float valor;

    public ItemOrcamento (String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String GetHistorico() {
        return historico;
    }

    public float GetValor() {
        return valor;
    }
}