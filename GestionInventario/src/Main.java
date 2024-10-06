public class Main {
    public static void main(String[] args) {
 
        Inventario inventario = new Inventario();
 
        inventario.agregarProducto(new Producto(1, "Producto 1", "Descripción del Producto 1", 10.0, 50));
        inventario.agregarProducto(new Producto(2, "Producto 2", "Descripción del Producto 2", 15.0, 30));
 
        inventario.eliminarProducto(1);
    }
}
