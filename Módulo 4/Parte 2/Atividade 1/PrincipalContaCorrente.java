public class PrincipalContaCorrente {
    public static void main(String[] args) {
        // cliente 1
        Cliente cliente1 = new Cliente("Maria", "959.4230.650-56", "Silva");
        ContaCorrente conta1 = new ContaCorrente(1, "poupança", 1800.0);
        System.out.println("-----------------------------------------------");
            System.out.println("Olá, " + cliente1.nome + " " + cliente1.sobrenome + "!");
            conta1.ExibirExtrato();
            conta1.Depositar();

        // cliente 2
        Cliente cliente2 = new Cliente("Joana", "854.305.241-50", "Oliveira");
        ContaCorrente conta2 = new ContaCorrente(2, "cdb", 800.2);
            System.out.println("-----------------------------------------------");
            System.out.println("Olá, " + cliente2.nome + " " + cliente2.sobrenome + "!");
            conta2.Depositar();
            conta2.Sacar();
            conta2.Transferir(conta1, conta2);
    }
}