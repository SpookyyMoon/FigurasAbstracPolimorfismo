import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestor gestor = new Gestor();

        int opcion;
        while(true) {
            System.out.println("\n== Gestor de Figuras ==");
            System.out.println("1. Añadir figuras");
            System.out.println("2. Eliminar figura");
            System.out.println("3. Calcular perímetro total");
            System.out.println("4. Calcular area total"); // Me faltaba el area total
            System.out.println("5. Mostrar figura con mayor área");
            System.out.println("6. Mostrar figura con mayor perímetro");
            System.out.println("7. Listar todas las figuras");
            System.out.println("8. Listar por tipos");
            System.out.println("9. Mover figura");
            System.out.println("\n10. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuCrearFigura(sc, gestor);
                    break;
                case 2:
                    System.out.println("\n== Eliminar Figura ==");
                    gestor.mostrarFiguras();
                    System.out.print("Ingrese el índice de la figura a eliminar: ");
                    int indiceEliminar = sc.nextInt();
                    gestor.eliminarFigura(indiceEliminar);
                    break;
                case 3:
                    System.out.println("\nPerímetro total de todas las figuras: " + gestor.calcularPerimetroTotal());
                    break;
                case 4:
                    System.out.println("\nArea total de todas las figuras: " + gestor.calcularAreaTotal());
                    break;
                case 5:
                    gestor.mostrarFiguraMayorArea();
                    break;
                case 6:
                    gestor.mostrarFiguraMayorPerimetro();
                    break;
                case 7:
                    gestor.mostrarFiguras();
                    break;
                case 8:
                    // COdigo de fiuguras por tipo
                    break;
                case 9:
                    System.out.println("\n== Mover Figura ==");
                    gestor.mostrarFiguras();
                    System.out.print("Ingrese el índice de la figura a mover: ");
                    int indiceMover = sc.nextInt();
                    System.out.print("Ingrese nueva posición X: ");
                    int nuevaX = sc.nextInt();
                    System.out.print("Ingrese nueva posición Y: ");
                    int nuevaY = sc.nextInt();
                    gestor.moverFigura(indiceMover, nuevaX, nuevaY);
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuCrearFigura(Scanner sc, Gestor gestor) {
        int opcion;
        do {
            System.out.println("\n== Crear Figura ==");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Triángulo");
            System.out.println("5. Volver");
            System.out.print("Seleccione el tipo de figura: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Color: ");
                String color = sc.next();
                System.out.print("Nombre: ");
                String nombre = sc.next();
                System.out.print("Posición X: ");
                int x = sc.nextInt();
                System.out.print("Posición Y: ");
                int y = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Lado: ");
                        int lado = sc.nextInt();
                        gestor.crearCuadrado(color, nombre, x, y, lado);
                        break;
                    case 2:
                        System.out.print("Base: ");
                        int base = sc.nextInt();
                        System.out.print("Altura: ");
                        int altura = sc.nextInt();
                        gestor.crearRectangulo(color, nombre, x, y, base, altura);
                        break;
                    case 3:
                        System.out.print("Radio: ");
                        int radio = sc.nextInt();
                        gestor.crearCirculo(color, nombre, x, y, radio);
                        break;
                    case 4:
                        System.out.print("Base: ");
                        base = sc.nextInt();
                        System.out.print("Altura: ");
                        altura = sc.nextInt();
                        System.out.print("Lado 1: ");
                        int lado1 = sc.nextInt();
                        System.out.print("Lado 2: ");
                        int lado2 = sc.nextInt();
                        gestor.crearTriangulo(color, nombre, x, y, base, altura, lado1, lado2);
                        break;
                }
            }
        } while (opcion != 5);
    }
}