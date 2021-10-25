import java.util.ArrayList;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario("Luis", "Silva", 10, 25.50);

        novoFuncionario.ExibirNomeCompleto();
        novoFuncionario.CalcularSalario();
        novoFuncionario.IncrementarHoras(8);
        novoFuncionario.CalcularSalario();

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
            funcionarios.add(new Funcionario("Letícia","Paulino", 20, 30.50));
            funcionarios.add(new Funcionario("Mayara","Melo", 30, 40.50));
            funcionarios.add(new Funcionario("Carolina","Porfírio", 40, 50.50));
            funcionarios.add(new Funcionario("Dara","Oliveira", 50, 60.50));
            funcionarios.add(new Funcionario("Rosallyne","Chagas", 60, 70.50));
            funcionarios.add(new Funcionario("Kauã","Silva", 70, 80.50));
            funcionarios.add(new Funcionario("Danilo","Paulino", 80, 90.50));
            funcionarios.add(new Funcionario("Catarina","Porfírio", 90, 10.50));
            funcionarios.add(new Funcionario("Karla","Tavares", 10, 20.50));
    }
}
