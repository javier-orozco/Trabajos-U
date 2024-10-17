import java.util.ArrayList;

class Impresion extends Producto {

    private String color;
    private ArrayList<Foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }
    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    public void imprimirFotos() {
        for (Foto foto : fotos) {
            foto.print();
        }

    }

    public String getColor() {
        return color;
    }
}