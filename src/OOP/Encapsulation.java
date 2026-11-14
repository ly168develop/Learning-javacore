package OOP;

public class Encapsulation{
    private double balance;

    public Encapsulation(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    static void main(String[] args) {
        Encapsulation account = new Encapsulation(1000);
        account.deposit(500);
//        account.balance = 500; -> can set value, if it's a same class
//        account.setBalance(3000);
        System.out.println("Balance: " + account.getBalance());
    }
}

