import java.util.LinkedList;
import java.util.Scanner;

public class ModificarRegistro {
    public LinkedList<ObjProductos> Modificar(String nombre, LinkedList<ObjProductos> lista) {
        BuscarRegistro b = new BuscarRegistro();
        Scanner sc = new Scanner(System.in);
        ObjProductos o = new ObjProductos();
        o = b.Buscar(lista, nombre);
        int opt = 0;
        if (!o.getNombre().isEmpty()) {
            for (ObjProductos p : lista) {
                if (p.getNombre().equalsIgnoreCase(o.getNombre())) {
                    System.out.println("Ingrese 1: para modificar cantidad");
                    System.out.println("Ingrese 2: para modificar precio");
                    System.out.println(" pulse cualquier numero para modificar los dos registros");
                    while (!sc.hasNextInt()) {
                        System.out.println("ingrese un numero");
                        sc.next();
                    }
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("ingrese la cantidad");
                            p.setCantidad(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("ingrese el precio");
                            p.setPrecio(sc.nextDouble());
                            break;

                        default:
                            System.out.println("ingrese la cantidad");
                            p.setCantidad(sc.nextInt());
                            System.out.println("ingrese el precio");
                            p.setPrecio(sc.nextDouble());
                            break;
                    }
                }

            }

        }
        return lista;

    }

}
