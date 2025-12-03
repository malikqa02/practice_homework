package practice6.restaurant;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;
    public RestaurantManager(){
        this.orders = new LinkedList<>();
    }
    // добавлять заказ в конец очереди
    public void addNewOrder(String order){
        orders.addLast(order);
    }
    // обрабатывать заказ из начала очереди и удалить его
    public String getNextOrderForProcessing(){
        return orders.poll();
    };
    // удалять заказ из любого места
    public void removeOrder(String order){
        orders.remove(order);
    }
    //распечатать все заказы
    public void printOrders(){
        System.out.println("Все заказы: ");
        orders.forEach(System.out::println);
        System.out.println();
    }
}
