import java.util.ArrayList;

public class Invoice {
    private String code;
    private String invoiceDate;
    private ArrayList<Freelance> clienteFreelance;
    private ArrayList<Company> clienteCompany;
    private ArrayList<Product> poducts;
    private ArrayList<Services> services;
    private double taxBase;
    private double total;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

}
