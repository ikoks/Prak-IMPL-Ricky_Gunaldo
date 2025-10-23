package Latihan_SRP;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        order.addItem(item);
        orderHistory history = new orderHistory();
        history.getDailyHistory();
        orderViewer viewer = new orderViewer();
        viewer.printOrder(order);
    }
}
