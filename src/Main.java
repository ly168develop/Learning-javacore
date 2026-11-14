import OOP.Encapsulation;

public class Main {
    static void main(String[] args) {
        System.out.println("HELLO, this is my lession 1");

        // we can set directly with obj.balance = 500 => wrong
        Encapsulation obj = new Encapsulation(2000);
//        obj.deposit(500);
//        obj.setBalance(-500);
        System.out.print(obj.getBalance());
    }
}
