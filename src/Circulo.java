public class Circulo extends Figura {
    private int radio;
    // Constante cambiada de minúscula a mayúscula, además se declaran como final!!
    private final double PI = 3.141592;

    public Circulo(String color, String nombre, int posX, int posY, int radio) {
        super(color, nombre, posX, posY);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public float calcularArea() {
        return (float) PI * radio * radio;
    }

    @Override
    public float calcularPerimetro() {
        return (float) ((double) 2 * PI * radio);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Radio: " + radio + "\n" +
                "Area: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}