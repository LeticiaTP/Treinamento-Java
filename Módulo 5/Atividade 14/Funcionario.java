import javax.swing.JOptionPane;

public class Funcionario {
    public String nome;
    public String sobrenome;
    protected Integer horasTrabalhadas;
    protected double valorPorHora;
    
    public Funcionario(String nome, String sobrenome, Integer horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public void ExibirNomeCompleto() {
        JOptionPane.showMessageDialog(null, "O nome completo do funcionário é: " + nome + " " + sobrenome + ".");
    }

    public void CalcularSalario() {
        double salario = horasTrabalhadas * valorPorHora;
        JOptionPane.showMessageDialog(null, "Salário no total: R$" + salario + ".");
    }

    public void IncrementarHoras(Integer horas) {
        horasTrabalhadas = horasTrabalhadas +  horas;
        JOptionPane.showMessageDialog(null, "O total de horas do funcionário é: " + horasTrabalhadas + ".");
    }
}