public class Autonomo extends Cliente{
    private String nombre;
    private String apellidos;
    private String dni;
    private String provincia;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String toString(){
        return  "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nDNI: " + dni + "\nProvincia: " + provincia + "\nPoblacion: " + poblacion + "\nCodigo Postal: " +codigoPostal +  "\nEmail: " + email + "\nTelefono: " + telefono + "\nCodigo De Cliente: " + codigo ;
    }
}
