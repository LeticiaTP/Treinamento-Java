public class Carro {
    public String marca;
    public String colorCode;
    public double price;

    public Carro() {  
    }

    public Carro(String marca, String colorCode, double price) {
        this.marca = marca;
        this.colorCode = colorCode;
        this.price = price;
    }

    public String Buzinar() {
        return "Buzinando!! Bi! Bi! Bi!";
    }

    public String Exibir() {
        return "Marca: " + marca + ", color Code: " + colorCode + ", Preço: " + price;
    }
}