public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("1007856245", "Miguel Franco");


        Impresion impresion = new Impresion(1, "Blanco y negro");
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        impresion.agregarFoto(foto1);
        impresion.agregarFoto(foto2);


        Camara camara = new Camara(2, "Canon", "EOS Rebel T7");

        Pedido pedido = new Pedido(cliente, 1007856245);
        pedido.agregarProducto(impresion);
        pedido.agregarProducto(camara);

        pedido.mostrarPedido();
    }
}