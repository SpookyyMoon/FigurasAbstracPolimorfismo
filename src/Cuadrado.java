public class Cuadrado extends Figura {
    // Se supone que estos atributos no es necesario acceder a ellos desde fuera de la clase, así que cambian a privado
    private int lado;

    public Cuadrado(String color, String nombre, int posX, int posY, int lado) {
        super(color, nombre, posX, posY);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return (float) lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return (float) 4 * lado;
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Lado: " + lado + "\n" + // Cambio a "lado", es más correcto
                "Area: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}