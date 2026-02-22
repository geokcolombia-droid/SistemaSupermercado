import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombreProducto;
        double precio;
        int cantidad;

        System.out.println("=================================");
        System.out.println(" SISTEMA DE SUPERMERCADO SENA ");
        System.out.println("=================================");

        System.out.print("Ingrese nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Ingrese precio: ");
        precio = scanner.nextDouble();

        System.out.print("Ingrese cantidad: ");
        cantidad = scanner.nextInt();

        Producto producto = new Producto(nombreProducto, precio, cantidad);

        Venta venta = new Venta(producto);

        System.out.println("=================================");
        venta.mostrarVenta();
        System.out.println("=================================");

        scanner.close();

    }

}