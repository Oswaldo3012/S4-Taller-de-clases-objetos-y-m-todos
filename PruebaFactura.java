import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String numero;
        String descripcion;
        int cantidad;
        double precio;

        System.out.println("===== SISTEMA DE FACTURA =====");

        do {
            System.out.print("Ingrese número de pieza: ");
            numero = entrada.nextLine();

            if (numero.trim().isEmpty()) {
                System.out.println("ERROR: No puede estar vacío.");
            }

        } while (numero.trim().isEmpty());

        do {
            System.out.print("Ingrese descripción de la pieza: ");
            descripcion = entrada.nextLine();

            if (descripcion.trim().isEmpty()) {
                System.out.println("ERROR: No puede estar vacío.");
            }

        } while (descripcion.trim().isEmpty());

        do {
            System.out.print("Ingrese cantidad de artículos: ");
            cantidad = entrada.nextInt();

            if (cantidad <= 0) {
                System.out.println("ERROR: Debe ingresar un número mayor que 0.");
            }

        } while (cantidad <= 0);

        do {
            System.out.print("Ingrese precio por artículo: ");
            precio = entrada.nextDouble();

            if (precio <= 0) {
                System.out.println("ERROR: El precio debe ser mayor que 0.");
            }

        } while (precio <= 0);

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        System.out.println("\n===== DATOS DE LA FACTURA =====");
        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por artículo: $" + factura.getPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura.obtenerMontoFactura());

        entrada.close();
    }
}
