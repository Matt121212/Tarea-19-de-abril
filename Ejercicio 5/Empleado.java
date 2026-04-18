import java.util.Scanner;

public class Empleado {
    String nombre;
    int horas_trabajadas;
    float pago_por_hora;

    public void ingresarDatos() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horas_trabajadas = input.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        pago_por_hora = input.nextFloat();
    }

    public float calcularSueldoBase() {
        return horas_trabajadas * pago_por_hora;
    }

    public float calcularBono() {
        return 20.0f;
    }

    public float calcularSueldoFinal(float base, float bono) {
        return base + bono;
    }

    public void mostrarReporte() {
        float sueldoBase = calcularSueldoBase();
        float bono = calcularBono();
        float sueldoFinal = calcularSueldoFinal(sueldoBase, bono);

        System.out.println("----------- REPORTE DE EMPLEADO -----------");
        System.out.println("\nNombre: " + nombre);
        System.out.println("\nSueldo base: " + sueldoBase);
        System.out.println("\nBono: " + bono);
        System.out.println("\nSueldo final: " + sueldoFinal);
        System.out.println("\n-------------------------------------------");
    }
}