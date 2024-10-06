import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(int id) {
        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                listaProductos.remove(p);
                break;
            }
        }
    }

}
