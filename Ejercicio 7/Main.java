public class Main {
    public static void main(String[] args) {

        Producto ssd = new Producto("PRD-105", "Disco SSD 1TB", "Almacenamiento", 89.50f, 12, 8);

        System.out.println("--- REGISTRO INICIAL ---");
        ssd.mostrarReporte();

        System.out.println("\n--- ACTUALIZACIÓN DE DATOS VÁLIDOS ---");
        ssd.setPrecio(95.00f);
        ssd.setStock(5);
        ssd.mostrarReporte();

        System.out.println("\n--- INTENTO DE ACTUALIZACIÓN INVÁLIDA ---");
        ssd.setStock(-3);
        ssd.mostrarReporte();
    }
}