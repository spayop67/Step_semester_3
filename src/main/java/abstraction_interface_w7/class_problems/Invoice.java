package abstraction_interface_w7.class_problems;

public class Invoice implements Printable {
    private String invoiceNumber;
    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public String printLabel() {
        return "Invoice label: " + invoiceNumber;
    }
}