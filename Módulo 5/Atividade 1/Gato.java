public class Gato {
    public String nome;
    public int idade;

    public Gato() {
    }

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void EmitirSom() {
        System.out.println("Miau! Miau!");
    }
}