// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //Scanner scan = new Scanner(System.in);
        Autonomo cliente01 = new Autonomo();
        cliente01.setNombre("Juan");
        cliente01.setApellidos("Perez Ravarta");
        cliente01.setDni("98398385J");
        cliente01.setCodigo("#jisuy79");
        cliente01.setProvincia("Granada");
        cliente01.setPoblacion("Panpaneira");
        cliente01.setCodigoPostal("29006");
        cliente01.setEmail("jperav@email.com");
        cliente01.setTelefono("677839939");

        Company cliente02 = new Company();
        cliente02.setRazonSocial("Floristeria Rosario SL");
        cliente02.setCif("128936223");
        cliente02.setCodigo("#fakdi92");
        cliente02.setPoblacion("Jerez de la frontera");
        cliente02.setCodigoPostal("27001");
        cliente02.setEmail("flor.rosario@email.com");
        cliente02.setTelefono("98273974");

        Productos producto1 = new Productos();
        producto1.setCodigo("#92000");
        producto1.setNombre("sfdvc");
        producto1.setMarca("Pashus");
        producto1.setModelo("Chispas");
        producto1.setPrecio(30);
        producto1.setIva(0.21);

        Productos producto2 = new Productos();
        producto2.setCodigo("#34565");
        producto2.setNombre("dffs");
        producto2.setMarca("Chispas");
        producto2.setModelo("356");
        producto2.setPrecio(10);
        producto2.setIva(0.04);

        Productos producto3 = new Productos();
        producto3.setCodigo("#54803");
        producto3.setNombre("df");
        producto3.setMarca("Chispas");
        producto3.setModelo("767");
        producto3.setPrecio(5);
        producto3.setIva(0);

        System.out.println(producto3);

        Servicios sercicio1 =new Servicios();
        sercicio1.setCodigo("#35794");
        sercicio1.setNombre("wert");
        sercicio1.setPrecio(15);
        sercicio1.setIva(0.10);

        Servicios sercicio2 =new Servicios();
        sercicio2.setCodigo("#98432");
        sercicio2.setNombre("dvft");
        sercicio2.setPrecio(50);
        sercicio2.setIva(0.21);

        Servicios sercicio3 =new Servicios();
        sercicio3.setCodigo("#98432");
        sercicio3.setNombre("dvft");
        sercicio3.setPrecio(28);
        sercicio3.setIva(0.04);

        Factura factura01 = new Factura();
        factura01.setCodigo("#isjisj");
        factura01.setFechaFactura("29/07/2019");
        factura01.setCliente(cliente01);
        factura01.agregarProducto(producto1);
        factura01.agregarServicio(sercicio1);
        factura01.setBaseInponible(factura01.calcularBaseImponible());
        factura01.setIvaProducto(factura01.calcularTotalIVA());
        factura01.setTotal(factura01.calcularTotal());

        System.out.println(factura01.getTotal());

        Factura factura02 = new Factura();
        factura02.setCodigo("#ns98h3");
        factura02.setFechaFactura("17/10/2022");
        factura02.setCliente(cliente02);
        factura02.agregarProducto(producto2);
        factura02.agregarProducto(producto3);
        factura02.agregarServicio(sercicio2);
        factura02.agregarServicio(sercicio3);
        factura02.setBaseInponible(factura02.calcularBaseImponible());
        factura02.setIvaProducto(factura02.calcularTotalIVA());
        factura02.setTotal(factura02.calcularTotal());

     }
}
