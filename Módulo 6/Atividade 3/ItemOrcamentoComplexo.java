public class ItemOrcamentoComplexo extends ItemOrcamento {
    public ItemOrcamento item[];
    
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] item) {
        super(historico, valor);
        this.item = item;
    }
    
    @Override
    public float GetValor() {
        float totalSoma = 0;
        int tamanhoArray = item.length;

        for(int i = 0; i <= tamanhoArray ; i++) {
            totalSoma = totalSoma + item[i].valor;
        }

        return totalSoma;
    }

    public ItemOrcamento EncontraItem(String historico) {
        int tamanhoArray = item.length;

        for(int i = 0; i <= tamanhoArray; i++) {
            if (item[i].GetHistorico() == historico)  {
                return item[i];
            }
        }
        return null;
    }
}
