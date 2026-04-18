import java.util.Scanner;

public class PlanillaLuz {
    String nombre_del_cliente;
    float consumo, costo_por_kW;

    public float calcularSubtotal() {
        return consumo * costo_por_kW;
    }

    public float calcularIVA(float subtotal) {
        return subtotal * 0.15f;
    }

    public float calcularTotal(float subtotal, float iva) {
        return subtotal + iva;
    }

    public String generarPlanilla() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        nombre_del_cliente = input.nextLine();

        System.out.print("Ingrese el consumo (kW): ");
        consumo = input.nextFloat();

        System.out.print("Ingrese el costo por kW: ");
        costo_por_kW = input.nextFloat();

        float subtotal = calcularSubtotal();
        float iva = calcularIVA(subtotal);
        float total = calcularTotal(subtotal, iva);

        String reporte = "----------- PLANILLA DE LUZ -----------\n\n" +
                "Cliente: " + nombre_del_cliente + "\n\n" +
                "Subtotal: " + subtotal + "\n\n" +
                "IVA: " + iva + "\n\n" +
                "Total a pagar: " + total + "\n\n" +
                "---------------------------------------";

        return reporte;
    }
}