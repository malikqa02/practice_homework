package practice6.restaurant;

public class main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        manager.addNewOrder("french fries");
        manager.addNewOrder("steak");
        manager.addNewOrder("spaghetti");
        manager.printOrders();
        manager.removeOrder("steak");
        manager.printOrders();

    }
}
