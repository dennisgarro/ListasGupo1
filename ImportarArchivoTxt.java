import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxt {
    public LinkedList<ObjProductos> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<ObjProductos> productos = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            ObjProductos producto = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Nombre: ")) {
                    if (producto != null) {
                        productos.add(producto);
                    }
                    producto = new ObjProductos();
                    producto.setNombre(line.substring(8)); // Remover "Nombre: "
                } else if (line.startsWith("Precio: ")) {
                    if (producto != null) {
                        producto.setPrecio(Double.parseDouble(line.substring(8))); // Remover "Precio: "
                    }
                } else if (line.startsWith("Cantidad: ")) {
                    if (producto != null) {
                        producto.setCantidad(Integer.parseInt(line.substring(10))); // Remover "Cantidad: "
                        productos.add(producto); // Añadir el producto al final del archivo
                        producto = null; // Reiniciar para el siguiente producto
                    }
                }
            }
            // Asegurarse de agregar el último producto si el archivo no termina con un
            // separador
            if (producto != null) {
                productos.add(producto);
            }
            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return productos;
    }
}
