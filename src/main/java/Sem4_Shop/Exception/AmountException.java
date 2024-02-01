package Sem4_Shop.Exception;

public class AmountException extends Exception{
    private String customer;
    private String product;
    public AmountException(String customer, String product) {
        this.customer = customer;
        this.product = product;
    }

    public AmountException(String message) {
        super(message);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
