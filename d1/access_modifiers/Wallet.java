package access_modifiers;

public class Wallet {
   private double balance;


    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance<0){
            this.balance = 0;
            return;  
        }
        this.balance = balance;
    }
}
