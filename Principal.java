import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLenarLista ll = new LLenarLista();
        LinkedList<ObjProductos> lista = new LinkedList<>();
        lista = ll.llenarLista();
        ExportarArchivo ea = new ExportarArchivo();
        ea.exportarArchivo(lista);
        System.out.println(lista);
    }

}
