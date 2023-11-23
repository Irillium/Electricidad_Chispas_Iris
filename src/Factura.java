import java.util.ArrayList;

public class Factura {
    private String codigo;
    private String fechaFactura;
    private String cliente;
    private double baseInponible;
    private double total;
    ArrayList<Productos>producto;
    ArrayList<Servicios>servicio;

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
