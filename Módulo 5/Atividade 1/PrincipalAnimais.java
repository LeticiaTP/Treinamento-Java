public class PrincipalAnimais {
    public static void main(String[] args) {
        Gato gato = new Gato("Pérola", 7);
        Dog dog = new Dog("Bela", 2);

        gato.EmitirSom();
        dog.EmitirSom();
    }
}