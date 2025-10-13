package practice5.task2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("кружка", 120, 2);
        Item phone = new Electronics("Айфон", 100000, 1);
        Item shoes = new Clothes("Кроссовки", 25000, 4);
        Manager maga = new Manager();
        maga.manage(mug);
        maga.manage(phone);
        maga.manage(shoes);
    }
}
