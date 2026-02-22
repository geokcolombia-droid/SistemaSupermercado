public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("Arroz", 2500, 3);

        Cliente cliente = new Cliente("Juan", "123456");

        Venta venta = new Venta(producto);

        venta.mostrarVenta();

    }

}