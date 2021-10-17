public class Dog {
    public String nome;
    public int idade;

    public Dog() {
    }

    public Dog(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void EmitirSom() {
        System.out.println("Au! Au!");
    } 
}