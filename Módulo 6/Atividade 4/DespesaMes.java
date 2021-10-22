public class DespesaMes {
    private int mes;
    private float valor;

    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public int GetMes() {
        return mes;
    }

    public float GetValor() {
        return valor;
    }
}