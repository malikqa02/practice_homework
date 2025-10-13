package practice5.task1;

public class Ship extends Transport {
    public Ship(){
        super(40, 5000); //создали дефолт конструктор со словом супер, благодаря которому можно проставить значения приватным полям, к которым не обратиться без слова супер
    }
    @Override
    public void start(){
        System.out.println("Корабль поплыл");
    }
}
