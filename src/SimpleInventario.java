import java.util.Scanner;

public class SimpleInventario {

    static String [] articulos = new String[5];
    public static void agregarArticulo(){
       for (int indice = 0; indice < articulos.length; indice++){
           articulos[indice] =  obtenerNombreArticulo();
       }
    }
    public static void removerArticulo(int id) {
        if (id > 0) ;{
            System.out.println("Ejecutado");
        }
    }
    public static double obtenerPrecioArticulo(){
        double precio = (Math.random()*5000) + 100;
        if (precio > 0.00){
            return precio;
        }else{
            return -1;
        }
    }
    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulos registrados: " );
        for (String articulo: articulos){
            System.out.println(articulo);
        }
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
    public static void modificarArticulo() {
        String nombre = obtenerNombreArticulo();
        double precio = obtenerPrecioArticulo();
        if (nombre.startsWith("A")||nombre.startsWith("D")){
            obtenerNombreArticulo();
            if (precio >= 150 && precio <= 250){
                precio = precio + (precio * 0.02);
                System.out.println(nombre + precio);
            } else if (precio > 250 && precio <= 500){
                precio = precio + (precio * 0.08);
                System.out.println(nombre + precio);
            }else{ precio = precio + (precio * 0.012);}

        } else if (nombre.startsWith("C")||nombre.startsWith("M")) {
            precio = precio - (precio * 0.20);
            System.out.println(nombre + precio);
        }
    }

    public static void main(String[] args) {
        agregarArticulo();
        imprimirInventario();

    }
}