import java.util.Scanner;

public class PedidoRestaurante {
    String cliente, plato;
    float precio;
    int cantidad;

    public void ingresarDatos() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el cliente: ");
        cliente = input.nextLine();

        System.out.print("Ingrese el plato: ");
        plato = input.nextLine();

        System.out.print("Ingrese el precio: ");
        precio = input.nextFloat();

        System.out.print("Ingrese la cantidad: ");
        cantidad = input.nextInt();
    }

    public float calcularSubtotal() {
        return precio * cantidad;
    }

    public float calcularDescuento(float subtotal) {
        if (subtotal > 25) {
            return subtotal * 0.10f;
        } else {
            return 0.0f;
        }
    }

    public float calcularTotalFinal(float subtotal, float descuento) {
        return subtotal - descuento;
    }

    public void mostrarCuenta() {
        float subtotal = calcularSubtotal();
        float descuento = calcularDescuento(subtotal);
        float totalFinal = calcularTotalFinal(subtotal, descuento);

        System.out.println("------------- CUENTA DEL PEDIDO -------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("\nPlato: " + plato);
        System.out.println("\nPrecio: " + precio);
        System.out.println("\nCantidad: " + cantidad);
        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("\nDescuento: " + descuento);
        System.out.println("\nTotal final: " + totalFinal);
    }
}