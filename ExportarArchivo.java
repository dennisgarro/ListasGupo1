import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    public void exportarArchivo(LinkedList<ObjProductos> productos) {
        if (productos.isEmpty()) {
            LLenarLista ll = new LLenarLista();
            productos = ll.llenarLista(productos);
        } else {
            try (FileWriter escriba = new FileWriter("Producto.txt")) {
                for (ObjProductos objProductos : productos) {
                    escriba.write("Nombre: " + objProductos.getNombre() + "\n");
                    escriba.write("Precio: " + objProductos.getPrecio() + "\n");
                    escriba.write("Cantidad: " + objProductos.getCantidad() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
