  
import javax.swing.JOptionPane;

public class Retangulo {
    public Double lado1;
    public Double lado2;
    public Double  area;
    public Double perimetro;

    public Retangulo() {
    }

    public Retangulo(Double lado1, Double lado2, Double  area, Double perimetro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
        this.perimetro = perimetro;
    }

    public void CalcularArea() {
        area = lado1 * lado2;
        JOptionPane.showMessageDialog(null, "A área total é: " + area);
    }

    public void CalcularPerimetro() {
        perimetro = (lado1 * 2) + (lado2 * 2);
        JOptionPane.showMessageDialog(null, "O perímetro é: " + perimetro);
    }

    public static void main(String[] args) {
        // Exemplo
        Retangulo novoRetangulo = new Retangulo(10.0, 5.0, 0.0, 0.0);
        novoRetangulo.CalcularArea();
        novoRetangulo.CalcularPerimetro();
        novoRetangulo.lado2 = 7.0;
        novoRetangulo.CalcularArea();
        novoRetangulo.CalcularPerimetro();

        // Novas instâncias de retângulos

        Retangulo Retangulo1 = new Retangulo(50.0, 15.0, 0.0, 0.0);
        Retangulo1.CalcularArea();
        Retangulo1.CalcularPerimetro();

        Retangulo Retangulo2 = new Retangulo(54.0, 25.0, 0.0, 0.0);
        Retangulo2.CalcularArea();
        Retangulo2.CalcularPerimetro();

        Retangulo Retangulo3 = new Retangulo(80.0, 50.0, 0.0, 0.0);
        Retangulo3.CalcularArea();
        Retangulo3.CalcularPerimetro();

        Retangulo Retangulo4 = new Retangulo(90.0, 40.0, 0.0, 0.0);
        Retangulo4.CalcularArea();
        Retangulo4.CalcularPerimetro();

        Retangulo Retangulo5 = new Retangulo(20.0, 10.0, 0.0, 0.0);
        Retangulo5.CalcularArea();
        Retangulo5.CalcularPerimetro();
    }
}
