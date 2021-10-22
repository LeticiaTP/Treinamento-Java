public class DespesaTotal {
   String cpf;
   DespesaMes despesas[];

   public DespesaTotal(String cpf, DespesaMes despesas[]) {
      this.cpf = cpf;
      this.despesas = despesas;
   }

   public String GetCpf() {
      return cpf;
   }

   public DespesaMes TotalizaMes(int mes) {
      float totalDespesas = 0;

      for(int i = 0; i <= despesas.length; i++) {
          if (despesas[i].GetMes() == mes) {
              totalDespesas = totalDespesas + despesas[i].GetValor();
          }
      }
      return new DespesaMes(mes, totalDespesas);
  }
}