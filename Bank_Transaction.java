public class Bank_Transaction {
    String account_name, accountholder_name, account_type;
    long account_number;
    double balance;

    Bank_Transaction(String aname, String holder, String type, long accno, double bal) {
        this.account_name = aname;
        this.accountholder_name = holder;
        this.account_type = type;
        this.account_number = accno;
        this.balance = bal;
    }

    void display() {
        System.out.println(account_name + " | " + accountholder_name + " | " + account_type + " | " + account_number + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_Transaction t = new Bank_Transaction("SBI", "Unnati", "Saving", 1234567890L, 5000.0);
        t.display();
    }
}
