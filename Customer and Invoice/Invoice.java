public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int _id, Customer _customer, double _amount) {
        id = _id;
        customer = _customer;
        amount = _amount;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer _customer) {
        customer = _customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double _amount) {
        amount = _amount;
    }

    public int getCustomerID() {
        return customer.getID();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        amount = amount - (amount * (customer.getDiscount() / 100));
        return amount;
    }

    public String toString() {
        return "Invoice[id=" + id + " ,customer=" + customer + " ,amount=" + amount + "]";
    }
}