package practice5.task1;

public class Car extends Transport {
    public Car() {
        super(70, 40); //создали дефолт конструктор со словом супер, благодаря которому можно проставить значения приватным полям, к которым не обратиться без слова супер
    }

    @Override
    public void start() {
        System.out.println("Машина поехала");
    }
}
