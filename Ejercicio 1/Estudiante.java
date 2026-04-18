import java.util.Scanner;
public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    public void registrarDatos(){
        Scanner imput = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = imput.nextLine();
        System.out.print("Ingrese su carrera: ");
        carrera = imput.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = imput.nextInt();

    }
    public void mostrarDatos(){
        System.out.println("----- DATOS DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }
}
