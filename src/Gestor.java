import java.util.ArrayList;

public class Gestor {
    // Las cuatro listas de figuras se unifican en una de polimorfismo
    private ArrayList<Figura> figuras = new ArrayList<>();

    public void crearCuadrado(String color, String nombre, int X, int Y, int lado) {
        figuras.add(new Cuadrado(color, nombre, X, Y, lado));
        System.out.println("Se ha creado el cuadrado: ");
        System.out.println(figuras.get(figuras.size() - 1));
    }

    public void crearRectangulo(String color, String nombre, int X, int Y, int base, int altura) {
        figuras.add(new Rectangulo(color, nombre, X, Y, base, altura));
        System.out.println("Se ha creado el rectángulo: ");
        System.out.println(figuras.get(figuras.size() - 1));
    }

    public void crearCirculo(String color, String nombre, int X, int Y, int radio) {
        figuras.add(new Circulo(color, nombre, X, Y, radio));
        System.out.println("Se ha creado el círculo: ");
        System.out.println(figuras.get(figuras.size() - 1));
    }

    public void crearTriangulo(String color, String nombre, int X, int Y, int base, int altura, int lado1, int lado2) {
        figuras.add(new Triangulo(color, nombre, X, Y, base, altura, lado1, lado2));
        System.out.println("Se ha creado el triángulo: ");
        System.out.println(figuras.get(figuras.size() - 1));
    }

    // Ahora existe un solo método para mostrar todas las figuras (Misma lista polimórfica)
    public void mostrarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras creadas.");
            return;
        }

        for (int i = 0; i < figuras.size(); i++) {
            System.out.println("Figura #" + i + ":");
            System.out.println(figuras.get(i));
        }
    }

    // Cambiado de métodos individuales para eliminar cualquier tipo de figura a uno para todos los tipos
    public void eliminarFigura(int indice) {
        if (indice >= 0 && indice < figuras.size()) {
            Figura eliminada = figuras.remove(indice);
            System.out.println("Se ha eliminado la figura: ");
            System.out.println(eliminada);
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void moverFigura(int indice, int nuevaX, int nuevaY) {
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).mover(nuevaX, nuevaY);
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void mostrarFiguraMayorArea() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras creadas.");
            return;
        }

        Figura mayorArea = figuras.get(0);
        for (Figura f : figuras) {
            if (f.calcularArea() > mayorArea.calcularArea()) {
                mayorArea = f;
            }
        }

        System.out.println("La figura con mayor área es: ");
        System.out.println(mayorArea);
    }

    public void mostrarFiguraMayorPerimetro() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras creadas.");
            return;
        }

        Figura mayorPerimetro = figuras.get(0);
        for (Figura f : figuras) {
            if (f.calcularPerimetro() > mayorPerimetro.calcularPerimetro()) {
                mayorPerimetro = f;
            }
        }

        System.out.println("La figura con mayor perímetro es: ");
        System.out.println(mayorPerimetro);
    }

    public float calcularPerimetroTotal() {
        float total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        return total;
    }

    public float calcularAreaTotal() {
        float total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        return total;
    }
}