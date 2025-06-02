public class Bank_Customer {
    String cust_name, cust_address;
    int cust_id;

    Bank_Customer(String name, int id, String address) {
        this.cust_name = name;
        this.cust_id = id;
        this.cust_address = address;
    }

    public void display() {
        System.out.println("Customer: " + cust_name + ", ID: " + cust_id + ", Address: " + cust_address);
    }

    public static void main(String[] args) {
        Bank_Customer c = new Bank_Customer("Unnati", 101, "Gujarat");
        c.display();
    }
}
