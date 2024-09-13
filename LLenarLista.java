import java.util.LinkedList;
import java.util.Scanner;

public class LLenarLista {

    public LinkedList<ObjProductos> llenarLista() {
        LinkedList<ObjProductos> lista = new LinkedList<>();
        boolean registros = true;
        int opt = 0;
        Scanner sc = new Scanner(System.in);
        while (registros) {
            ObjProductos op = new ObjProductos();
            System.out.println("Ingrese el nombre del producto");
            op.setNombre(sc.next());
            sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            while (!sc.hasNextDouble()) {
                System.out.println("Error de digitacion Ingrese un dato valido");
                sc.next();

            }
            op.setPrecio(sc.nextDouble());
            sc.nextLine();

            System.out.println("Ingrese la cantidad de productos");
            while (!sc.hasNextInt()) {
                System.out.println("Error de digitacion Ingrese un dato valido");
                sc.next();
            }
            op.setCantidad(sc.nextInt());
            sc.nextLine();
            lista.add(op);

            System.out.println("Desea agregar mas registros 1: Si , 2: No");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida por favor digite de nuevo");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 2) {
                registros = false;
            }
        }
        return lista;
    }
}
