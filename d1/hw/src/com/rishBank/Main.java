package hw.src.com.rishBank;
import hw.src.com.rishBank.enums.AccountType;
import hw.src.com.rishBank.services.Account;

public class Main {

    public static void main( String[] args){
        // String name,AccountType type, double balance
        Account first = new Account("Rishabh", AccountType.SAVINGS,10000);

        first.getAccountInfo();
        first.deposit(5000);
        first.withdraw(1000);
        first.getAccountInfo();
    }
    
}
