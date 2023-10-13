import java.util.Scanner;

public class SimpleInventario {

    public static void agregarArticulo(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su articulo:");
        String agregarArticulo = scanner.next();
        if (agregarArticulo.length() > 4)
            System.out.println("Articulo agregado exitosamente!");

        else {
            System.out.println("No se permite este articulo");

        }

    }

    public static void removerArticulo(int id) {
        if (id > 0) ;{
            System.out.println("Ejecutado");
        }
    }

    public static String obtenerPrecioArticulo(String articulo,double precio) {
        double random = (Math.random()*5000) + 100;

        if (articulo.startsWith("mar")&& precio >= 0.00) {
            return "Articulo" + articulo + "tiene un valor de RD$" + random;
        } else if (articulo.startsWith("tab")|| precio >= 12000.00) {
            return "Articulo" + articulo + "tiene un valor que sobrepasa los 12,000.00. El monto es de RD$" + random;
        }else return "ninguno de los ecenarios aplica";


    }


    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("articulo existente:" + articuloExistente);

    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        String nombre = scanner.next();
        if (nombre.length() > 3) {
            return nombre;
        } else {
            return "error de operacion";
        }
    }

    public static void main(String[] args) {
      obtenerNombreArticulo();

    }

}