package access_modifiers;

public class Main {
    public static void main(String[] args) {
        // Wallet rohit = new Wallet(5000);
        // rohit.balance = -10000;
        Wallet rohit = new Wallet();
        rohit.setBalance(-5000);
        System.out.println(rohit.getBalance());
    }
}

