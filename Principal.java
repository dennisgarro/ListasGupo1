import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLenarLista ll = new LLenarLista();
        LinkedList<ObjProductos> lista = new LinkedList<>();
        MostrarLista m = new MostrarLista();
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la opcion que desea");
            System.out.println("1: llenar lista");
            System.out.println("2: exportar archivo,");
            System.out.println("3: mostrar lista");
            System.out.println("4: importar archivo");
            System.out.println("5: Buscar registro por nombre");
            System.out.println("6: Modificar");
            System.out.println("7. ModificarRegistro");
            System.out.println("8: salir");
            int opt = 0;
            while (!sc.hasNextInt()) {
                System.out.println("la opcion ingresada no es valida por favor verifique");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    lista = ll.llenarLista(lista);
                    break;
                case 2:
                    ExportarArchivo ea = new ExportarArchivo();
                    ea.exportarArchivo(lista);
                    break;
                case 3:
                    m.mostrar(lista);
                    break;
                case 4:
                    ImportarArchivoTxt i = new ImportarArchivoTxt();
                    lista = i.leerArchivo("Producto");
                    break;
                case 5:
                    BuscarRegistro b = new BuscarRegistro();
                    String nombrebuscar = "";
                    System.out.println("ingrese el nombre que desea buscar");
                    nombrebuscar = sc.next();
                    ObjProductos result = b.Buscar(lista, nombrebuscar);
                    if (result.getNombre().isEmpty()) {
                        System.out.println("el registro no existe");
                    } else {
                        System.out.println("el nombre es: " + result.getNombre());
                        System.out.println("la cantidad es :" + result.getCantidad());
                        System.out.println("el precio es: " + result.getPrecio());
                    }

                    break;
                case 6:
                    System.out.println("pagina en mantenimiento");
                case 7:
                    System.out.println("Prueba para modificar el archivo...");

                    break;
                default:
                    if (opt == 8) {
                        bandera = false;
                    }
                    break;
            }

        }
    }

}
