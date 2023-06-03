package pe.edu.utp;

public class app {
    public static void main(String[] args) {
        Tienda tienda= new Tienda();
        Productos productos1= new Productos("Telefono","Negro 128gb Ram",1200,4);
        Productos productos2= new Productos("Laptop","HP 8GB Ram",3300,2);
        tienda.agregarProducto(productos1);
        tienda.agregarProducto(productos2);

        tienda.mostrarProductos();
        tienda.buscarProducto("Laptop");
        tienda.venderProducto("Laptop",1);
        System.out.println("El inventario figura en "+tienda.valorTotalInventario());


    }
}
