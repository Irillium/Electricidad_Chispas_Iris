import java.util.ArrayList;

public class Factura {
    private String codigo;
    private String fechaFactura;
    private String cliente;
    private double baseInponible;
    private double ivaProducto;
    private double total;
    private ArrayList<Productos> productos;
    private ArrayList<Servicios> servicios;

    public Factura() {
        this.productos = new ArrayList<>();  // Inicializar la lista de productos
        this.servicios = new ArrayList<>();  // Inicializar la lista de servicios
    }
    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    public void agregarServicio(Servicios servicio) {
        servicios.add(servicio);
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getBaseInponible() {
        return baseInponible;
    }

    public void setBaseInponible(double baseInponible) {
        this.baseInponible = baseInponible;
    }

    public double getIvaProducto() {
        return ivaProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIvaProducto(double ivaProducto) {
        this.ivaProducto = ivaProducto;
    }

    public double calcularBaseImponible() {
        double totalProductos = 0;
        double totalServicios = 0;

        for (Productos productos : productos) {
            totalProductos += productos.getPrecio();
        }

        for (Servicios servicios : servicios) {
            totalServicios += servicios.getPrecio();
        }

        return totalProductos + totalServicios;
    }

    public double calcularTotalIVA() {
        double ivaProductos = 0;
        double ivaServicios = 0;

        for (Productos productos : productos) {
            ivaProductos += productos.getPrecio() * productos.getIva();
        }

        for (Servicios servicios : servicios) {
            ivaServicios += servicios.getPrecio() * servicios.getIva();
        }

        return ivaProductos + ivaServicios;
    }

    public double calcularTotal() {
        return calcularBaseImponible() + calcularTotalIVA();
    }


}

