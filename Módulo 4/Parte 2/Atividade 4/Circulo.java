import javax.swing.JOptionPane;

public class Circulo {
    private float raio;
    private float area;
    private float perimetro;

    public Circulo() {
    }

    public Circulo(float raio, float area, float perimetro) {
        this.raio = raio;
        this.area = area;
        this.perimetro = perimetro;
    } 

    public void CalcularArea() {
        area = raio * raio * 3.14f;
        JOptionPane.showMessageDialog(null, "A área é: " + area);
    }

    public void CalcularPerimetro() {
        perimetro = 2 * 3.14f * raio;
        JOptionPane.showMessageDialog(null, "O perímetro é: " + perimetro);
    }

    public static void main(String[] args) {
        // exemplo 
        Circulo circulo = new Circulo(10, 30, 15);
        circulo.CalcularArea();
        JOptionPane.showMessageDialog(null, "A área é: " + circulo.area);
        circulo.CalcularPerimetro();
        JOptionPane.showMessageDialog(null, "O perímetro é: " + circulo.perimetro);
        circulo.raio = 4;
        circulo.CalcularArea();
        JOptionPane.showMessageDialog(null, "A área é: " + circulo.area);
        circulo.CalcularPerimetro();
        JOptionPane.showMessageDialog(null, "O perímetro é: " + circulo.perimetro);

        // 5 instâncias
        Circulo circulo1 = new Circulo(40, 20, 25);
        circulo1.CalcularArea();
        circulo1.CalcularPerimetro();

        Circulo circulo2 = new Circulo(30, 34, 16);
        circulo2.CalcularArea();
        circulo2.CalcularPerimetro();

        Circulo circulo3 = new Circulo(44, 12, 55);
        circulo3.CalcularArea();
        circulo3.CalcularPerimetro();

        Circulo circulo4 = new Circulo(59, 78, 21);
        circulo4.CalcularArea();
        circulo4.CalcularPerimetro();

        Circulo circulo5 = new Circulo(78, 34, 44);
        circulo5.CalcularArea();
        circulo5.CalcularPerimetro();
    }
}