import java.util.LinkedList;

public class BuscarRegistro {
    public ObjProductos Buscar(LinkedList<ObjProductos> lista, String nombreBucar) {
        ObjProductos result = new ObjProductos();
        for (ObjProductos o : lista) {
            if (o.getNombre().equalsIgnoreCase(nombreBucar)) {
                result.setNombre(o.getNombre());
                result.setCantidad(o.getCantidad());
                result.setPrecio(o.getPrecio());
            }
        }

        return result;
    }
}
