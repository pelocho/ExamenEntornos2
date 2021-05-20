package objects;

public class Menu {
    //comentario
    private String nombre;
    private String descripcion;
    private int precio;
    private Byte image;

    public Menu(String nombre, String descripcion, int precio, Byte image) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }
}
