public class CarroPrincipal {
    public static void main(String[] args) {    
        // instanciando   
        Carro ferrari = new Carro("Ferrari", "#FA58F4", 950.739);
        Carro carrinho = new Carro("Carrinho", "#FFFFFF", 287.854);

        // imprimindo os objetos com o método Exibir; "Buzinando" com o métopdo buzinar
        System.out.println(ferrari.Exibir());
        System.out.println(ferrari.Buzinar());
        System.out.println(carrinho.Exibir());
        System.out.println(carrinho.Buzinar());
    }
}
