public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int _id, String _name, int _discount) {
        id = _id;
        name = _name;
        discount = _discount;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int _discount) {
        discount = _discount;
    }

    public String toString() {
        return "name(" + id + ")(" + discount + "%)";
    }
}
