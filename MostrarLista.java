import java.util.LinkedList;

public class MostrarLista {
    public void mostrar(LinkedList<ObjProductos> lista) {
        for (ObjProductos objProductos : lista) {
            System.out.println("el nombresito es: " + objProductos.getNombre());
            System.out.println("el precio es:" + objProductos.getPrecio());
            System.out.println("la cantidad es " + objProductos.getCantidad());
            System.out.println();
            System.out.println("------------------------------------------");
        }
    }

}
