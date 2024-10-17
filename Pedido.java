import java.util.ArrayList;
import java.util.Date;

class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int tarjeta;

    public Pedido(Cliente cliente, int tarjeta) {
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.productos = new ArrayList<>();
        this.fecha = new Date();  // Fecha actual
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Tarjeta de Credito : " + tarjeta);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        for (Producto producto : productos) {
            if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println("Impresión a color: " + impresion.getColor());
                impresion.imprimirFotos();
            } else if (producto instanceof Camara) {
                Camara camara = (Camara) producto;
                System.out.println("Cámara: " + camara.getMarca() + " " + camara.getModelo());
            }
        }
    }
}