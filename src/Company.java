public class Company extends Cliente{
    private String razonSocial;
    private String cif;



    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    @Override
    public String toString(){
        return  "\nDATOS DEL CLIENTE \n\nRazón Social: " + razonSocial + "\nCIF: " + cif + "\nPoblacion: " + poblacion + "\nCodigo Postal: " +codigoPostal +  "\nEmail: " + email + "\nTelefono: " + telefono + "\nCodigo De Cliente: " + codigo ;
    }

}
