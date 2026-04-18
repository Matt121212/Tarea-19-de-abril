import java.util.Scanner;

public class Calificacion {
    String nombre_del_estudiante;
    float nota1, nota2, nota3;

    public float calcularPromedio() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre_del_estudiante = input.nextLine();

        System.out.print("Ingrese la nota 1: ");
        nota1 = input.nextFloat();

        System.out.print("Ingrese la nota 2: ");
        nota2 = input.nextFloat();

        System.out.print("Ingrese la nota 3: ");
        nota3 = input.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }

    public String determinarEstado(float promedio) {
        if (promedio >= 7 && promedio <= 10) {
            return "Aprobado";
        } else if (promedio < 7 && promedio >= 0) {
            return "Reprobado";
        } else {
            return "Ingrese bien los números";
        }
    }

    public String Mostrar_Datos() {
        float promedioFinal = calcularPromedio();
        String estadoFinal = determinarEstado(promedioFinal);

        String reporteFinal = "-------- REPORTE ACADÉMICO --------\n\n" +
                "Nombre: " + nombre_del_estudiante + "\n\n" +
                "Promedio final: " + promedioFinal + "\n\n" +
                "Estado: " + estadoFinal + "\n\n" +
                "-----------------------------------";

        return reporteFinal;
    }
}