package static_method;

public class Main {
    public static void main (String[] args){
        Order first = new Order();
        Order second = new Order();

        System.out.println(second.getOrderID()); //2
        System.out.println(first.getOrderID()); //1

        Order third = new Order();

        System.out.println(third.getOrderID());
        System.out.println(Order.getTotalOrders());

        
    }
}
