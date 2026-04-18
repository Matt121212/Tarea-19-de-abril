import java.util.Scanner;
public class Producto {
    String nombre_del_producto;
    float precio;
    int cantidad;

    public void ingresarDatos(){
        Scanner imput = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        nombre_del_producto = imput.nextLine();
        System.out.print("Ingrese el precio: ");
        precio = imput.nextFloat();
        System.out.print("Ingrese la cantidad: ");
        cantidad = imput.nextInt();
    }
    public void mostrarDatos() {
        System.out.println("----------- FACTURA -----------");
        System.out.println(" ");
        System.out.println("Producto: " + nombre_del_producto);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println(" ");
        float total = cantidad * precio;
        float descuento = (float)  (total * 0.10);
        if (precio > 1000 ){
            System.out.println("Total a pagar: $" + (total - descuento));
        }else{
            System.out.println("Total a pagar: $" + total);
            System.out.println("--------------------------------");
        }
    }
}