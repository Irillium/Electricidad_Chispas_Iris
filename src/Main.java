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
        System.out.println(cliente01.toString());
        System.out.println(cliente01);

    }
}