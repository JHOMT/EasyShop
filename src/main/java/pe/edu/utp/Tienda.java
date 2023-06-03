package pe.edu.utp;


import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Productos> listProducto;
    public Tienda(){
        listProducto= new ArrayList<>();
    }
    public void agregarProducto(Productos productos){
        listProducto.add(productos);
    }
    public void mostrarProductos(){
        for (Productos productos: listProducto) {
            String formato= """
                    ___________________________________________
                    Producto     : %s
                    Descripcion  : %s
                    Precio       : %s
                    Stock        : %s
                    """;
            System.out.printf(formato,productos.getProducto(),productos.getDescripcion(),productos.getPrecio(),productos.getStock());
        }
    }
    public void buscarProducto(String producto){
        boolean encontrado= false;
        System.out.println("----- Productos con el nombre "+producto+" -----");
        for (Productos productos : listProducto) {
            if (productos.getProducto().equalsIgnoreCase(producto)){
                String formato= """
                    ___________________________________________
                    Producto     : %s
                    Descripcion  : %s
                    Precio       : %s
                    Stock        : %s
                    """;
                System.out.printf(formato,productos.getProducto(),productos.getDescripcion(),productos.getPrecio(),productos.getStock());
                encontrado= true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron resultados del producto");
        }
    }
    public void venderProducto(String producto, int cantidad){
        boolean encontrado=false;
        for (Productos productos : listProducto) {
            if (productos.getProducto().equalsIgnoreCase(producto)){
                if (productos.getStock()>cantidad){
                    productos.setStock(productos.getStock()-cantidad);
                    System.out.println("La venta fue exitosa");
                }else {
                    System.out.println("Sobre  pasa el stock");
                }
            }
            encontrado= true;
        }
        if (!encontrado){
            System.out.println("No se encontro el producto");
        }
    }
    public double valorTotalInventario(){
        double sumaInventario=0;
        for (Productos productos : listProducto) {
            sumaInventario+=productos.getStock()*productos.getPrecio();
        }
        return sumaInventario;
    }
}
