public class Venta {

    private Producto producto;

    public Venta(Producto producto) {

        this.producto = producto;

    }

    public void mostrarVenta() {

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Total: " + producto.calcularTotal());

    }

}