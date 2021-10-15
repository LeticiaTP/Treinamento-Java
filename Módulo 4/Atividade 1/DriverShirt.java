public class DriverShirt {
    public static void main(String[] args) {    
        // instanciando   
        Shirt camisaPolo = new Shirt("Camisa confortável", "#FFFFFF", 30);
        Shirt camisaFeminina = new Shirt("Camisa desenhada para o público feminino", "#FA58F4", 40);

        // imprimindo os objetos com o método Display
        System.out.println(camisaPolo.Display());
        System.out.println(camisaFeminina.Display());
    }
}
