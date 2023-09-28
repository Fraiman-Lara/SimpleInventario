import java.util.Scanner;

public class SimpleInventario {

    public static void agregarArticulo(String s) {

    }

    public static void removerArticulo(int id) {

    }

    public static double obtenerPrecioArticulo(int id) {
        return 0.00;

    }

    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("articulo existente:"+ articuloExistente);

    }
    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        String nombre = scanner.next();
        System.out.println("Usted ha ingresado el articulo: " + nombre);
        return nombre;

    }
    public static void main(String[] args) {
        imprimirInventario();

    }

}