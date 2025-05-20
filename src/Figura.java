public abstract class Figura { // Clase convertida a abstracta

    // Mantengo los atributos como públicos para poder acceder a ellos en el toString de cada figura
    public String color;
    public String nombre;
    public int posX;
    public int posY;

    public Figura(String color, String nombre, int posX, int posY) {
        this.color = color;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    // Métodos cambiados a abstractos
    public abstract float calcularArea();
    public abstract float calcularPerimetro();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void mover(int nuevaX, int nuevaY) {
        // Un único método aquí para mover las figuras, era redundante tenerlo en cada figura
        this.posX = nuevaX;
        this.posY = nuevaY;
        System.out.println(nombre + " movido a (" + nuevaX + ", " + nuevaY + ")");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}