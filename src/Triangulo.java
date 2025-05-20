public class Triangulo extends Figura {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;

    public Triangulo(String color, String nombre, int posX, int posY, int base, int altura, int lado1, int lado2) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (float) (base * altura) / 2.0f;
    }

    @Override
    public float calcularPerimetro() {
        return (float) base + lado1 + lado2;
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