public class LineaVentas {

    private String codigo;
    private String nombre;
    private String marca;
    private String modelo;
    private double precio;
    private double iva;
    public LineaVentas(String codigo, String nombre, double precio, double iva ){
        this.codigo= codigo;
        this.nombre= nombre;
        this.precio= precio;
        this.iva= iva;
    }

    public LineaVentas(String codigo, String nombre,String marca, String modelo, double precio, double iva ){
        this.codigo= codigo;
        this.nombre= nombre;
        this.marca= marca;
        this.modelo= modelo;
        this.precio= precio;
        this.iva= iva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
