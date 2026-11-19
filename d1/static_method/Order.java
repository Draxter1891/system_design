package static_method;

class Order {
    private static int orderCount = 0;
    private int orderID;

    Order(){
        Order.orderCount++;
        this.orderID = orderCount;
    }
    static int getTotalOrders(){
        return orderCount;
    }
    int getOrderID(){
        return this.orderID;
    }
}
