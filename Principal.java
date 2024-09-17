import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLenarLista ll = new LLenarLista();
        LinkedList<ObjProductos> lista = new LinkedList<>();
        boolean bandera = true;
        while (bandera) {
            System.out.println(
                    "Ingrese la opcion que desea 1: llenar lista, 2: exportar archivo, 3: mostrar lista, 4: importar archivo, 5: salir");
            int opt = 0;
            while (!sc.hasNextInt()) {
                System.out.println("la opcion ingresada no es valida por favor verifique");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    lista = ll.llenarLista();
                    break;
                case 2:
                    ExportarArchivo ea = new ExportarArchivo();
                    ea.exportarArchivo(lista);
                    break;
                case 3:
                    System.out.println(lista);
                    break;
                case 4:
                    ImportarArchivoTxt i = new ImportarArchivoTxt();
                    MostrarLista m = new MostrarLista();
                    m.mostrar(lista = i.leerArchivo("Producto"));

                    break;
                default:
                    if (opt == 5) {
                        bandera = false;
                    }
                    break;
            }

        }
    }

}
