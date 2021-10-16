public class Shirt {
    String description;
    String colorCode;
    double price;

    public Shirt() {
    }

    public Shirt(String description, String colorCode, float price) {
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }
    
    public String Display() {
        return "Description: " + description + ", Color Code: " + colorCode + ", Price: " + price;
    }
}
