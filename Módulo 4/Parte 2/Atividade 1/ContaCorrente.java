import java.util.Date;
import java.util.Scanner; 

public class ContaCorrente {
    public int numero;
    public String nome;
    public Double saldo;
    public Date data;
    public Cliente cliente;

    public ContaCorrente() {        
    }
    
    public ContaCorrente(int numero, String nome, Double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.data = new Date();   
    }

    Scanner input = new Scanner(System.in);

    public void Depositar() {
        Double deposito;

        System.out.println("-----------------------------------------------");
        System.out.println("Quanto deseja Depositar?");
            deposito = input.nextDouble();
            saldo += deposito;
        System.out.println("O valor de " + deposito + "R$ foi depositado com sucesso!");
        System.out.println("Você possui um total de " + saldo + "R$ em sua conta.");
    }

    public void Sacar() {
        Double saque;

        System.out.println("-----------------------------------------------");
        System.out.println("Quanto deseja Sacar?");
        saque = input.nextDouble();
        
        if ( saque > saldo) {
            System.out.println("Você não possui esse valor na conta.");
        } else {
            saldo -= saque;
            System.out.println("O valor de " + saque + "R$ foi sacado com sucesso!");
            System.out.println("Você possui um total de " + saldo + "R$ em sua conta.");
       }
    }

    public void ExibirExtrato() {
        System.out.println("-----------------------------------------------");
        System.out.println("Seu saldo é de " + saldo + "R$!");
    }

    public void Transferir(ContaCorrente conta1, ContaCorrente conta2) {
        Double transferencia;

        System.out.println("-----------------------------------------------");
        System.out.println("Quanto deseja transferir?");
        transferencia = input.nextDouble();

        if( transferencia > conta2.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            conta2.saldo -= transferencia;
            conta1.saldo += transferencia;

            System.out.println("Transferência concluída! Seu saldo é de " + conta2.saldo + "R$!");
        }
    }
}