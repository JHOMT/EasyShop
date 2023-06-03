package pe.edu.utp;

public class Productos {
    private String producto;
    private String descripcion;
    private double precio;
    private int stock;

    public Productos(String producto, String descripcion, double precio, int stock) {
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
