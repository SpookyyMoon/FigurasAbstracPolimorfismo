public class Rectangulo extends Figura {
    // Se supone que estos atributos no es necesario acceder a ellos desde fuera de la clase, así que cambian a privado
    private int base;
    private int altura;

    public Rectangulo(String color, String nombre, int posX, int posY, int base, int altura) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (float) base * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (float) 2 * (base + altura);
    }

    @Override
    public String toString() {
        // Cambio de lado1/lado2 a base/altura
        return  "Nombre: " + nombre + "\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura + "\n" +
                "Area: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}