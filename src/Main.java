
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aplicacion[] juegos = new Aplicacion[4];

        // Registrar los juegos
        for (int i = 0; i < 4; i++) {

            System.out.println("Juego " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Categoria: ");
            String categoria = sc.nextLine().toLowerCase();

            System.out.print("Tamano en KB: ");
            double tamano = sc.nextDouble();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Licencias disponibles: ");
            int disponibles = sc.nextInt();

            System.out.print("Licencias vendidas: ");
            int vendidas = sc.nextInt();
            sc.nextLine();

            juegos[i] = new Aplicacion(
                    nombre, categoria, tamano,
                    precio, disponibles, vendidas
            );
        }

        double total = 0;
        int rompecabezas = 0;
        int deportes = 0;
        int accion = 0;

        // Comprar licencias
        for (int i = 0; i < 4; i++) {

            System.out.print("Cantidad de "
                    + juegos[i].getNombre() + ": ");

            int cantidad = sc.nextInt();

            int disponibles = juegos[i].getLicenciaDisponible()
                    - juegos[i].getLicenciaVendidad();

            if (cantidad < 0 || cantidad > disponibles) {
                System.out.println("Cantidad no valida");
                cantidad = 0;
            }

            total = total + cantidad * juegos[i].getPrecio();

            if (juegos[i].getCategoria().equals("rompecabezas")) {
                rompecabezas = rompecabezas + cantidad;
            }

            if (juegos[i].getCategoria().equals("deporte")
                    || juegos[i].getCategoria().equals("deportes")) {
                deportes = deportes + cantidad;
            }

            if (juegos[i].getCategoria().equals("accion")) {
                accion = accion + cantidad;
            }
        }

        // Descuento
        double descuento = 0;

        if (rompecabezas >= 25) {
            descuento = total * 0.20;
        } else if (deportes >= 20 && accion >= 15) {
            descuento = total * 0.15;
        }

        // Factura
        System.out.println("Total: " + total);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + (total - descuento));

        sc.close();
    }
}


