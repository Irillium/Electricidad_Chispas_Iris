import java.util.ArrayList;

public class Factura {
    private String codigo;
    private String fechaFactura;
    private String cliente;
    private double baseInponible;
    private double ivaProducto;
    private double total;
    ArrayList<LineaVentas>producto;
    ArrayList<LineaVentas>servicio;


    public ArrayList<LineaVentas> getServicio() {
        return servicio;
    }

    public void setServicio(ArrayList<LineaVentas> servicio) {
        this.servicio = servicio;
    }

    public ArrayList<LineaVentas> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<LineaVentas> producto) {
        this.producto = producto;
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

    public void Total(){
        if(ivaProducto == 21){
            total = baseInponible + (baseInponible * 0.21);
        }
        else if(ivaProducto == 10){
            total = baseInponible + (baseInponible * 0.10);
        }
        else if(ivaProducto == 4){
            total = baseInponible + (baseInponible * 0.04);
        }
        else if(ivaProducto == 0){
            total = baseInponible;
        }

    }
}

