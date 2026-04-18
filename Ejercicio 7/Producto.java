public class Producto {
    public String codigo;
    public String nombre;
    public String categoria;

    private float precio;
    private int stock;
    private int stock_minimo;

    public Producto(String codigo, String nombre, String categoria, float precio, int stock, int stock_minimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;

        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1.0f;
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }

        if (stock_minimo >= 0) {
            this.stock_minimo = stock_minimo;
        } else {
            this.stock_minimo = 0;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
            System.out.println("Éxito: Precio actualizado a $" + this.precio);
        } else {
            System.out.println("Error de validación: El precio no puede ser menor o igual a cero.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int nuevoStock) {
        if (nuevoStock >= 0) {
            this.stock = nuevoStock;
            System.out.println("Éxito: Stock actualizado a " + this.stock + " unidades.");
        } else {
            System.out.println("Error de validación: El stock disponible no puede ser negativo. Se mantiene en " + this.stock);
        }
    }

    public int getStockMinimo() {
        return stock_minimo;
    }

    public float calcularValorInventario() {
        return precio * stock;
    }

    public String determinarEstado() {
        if (stock == 0) {
            return "Producto agotado";
        } else if (stock < stock_minimo) {
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }

    public void mostrarReporte() {
        System.out.println("\n---------- REPORTE DE INVENTARIO ----------");
        System.out.println("Código: " + codigo);
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Stock actual: " + stock + " (Mínimo: " + stock_minimo + ")");
        System.out.println("Valor total del inventario: $" + calcularValorInventario());
        System.out.println("Estado: " + determinarEstado());
        System.out.println("-------------------------------------------");
    }
}