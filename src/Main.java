// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
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
        System.out.println(cliente01);

        Company cliente02 = new Company();
        cliente02.setRazonSocial("Floristeria Rosario SL");
        cliente02.setCif("128936223");
        cliente02.setCodigo("#fakdi92");
        cliente02.setPoblacion("Jerez de la frontera");
        cliente02.setCodigoPostal("27001");
        cliente02.setEmail("flor.rosario@email.com");
        cliente02.setTelefono("98273974");
        System.out.println(cliente02);

        /*ArrayList<LineaVentas>producto01 = new ArrayList<>();
        LineaVentas newproducto01 = new LineaVentas("#92000","ponchos","Pashus","lanaM",30,21 );
        ArrayList<LineaVentas>producto02 = new ArrayList<>();
        LineaVentas newproducto02 = new LineaVentas("#34565","rosales","Frajasdy","356",10,4 );
        ArrayList<LineaVentas>producto03 = new ArrayList<>();
        LineaVentas newproducto03 = new LineaVentas("#54803","cactus","Frajasdy","767",5,0 );

        ArrayList<LineaVentas>servicio01 = new ArrayList<>();
        LineaVentas newservicio01 = new LineaVentas("#35794","ramos",15,10 );
        ArrayList<LineaVentas>servicio02 = new ArrayList<>();
        LineaVentas newservicio02 = new LineaVentas("#98432","coronas",50,21 );*/

        Factura factura01 = new Factura();
        factura01.setFechaFactura("18/03/2017");
        factura01.setCodigo("#jshshdu9182");
        factura01.setCliente(cliente01.toString());

    }
}