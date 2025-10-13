package practice5.task1;

public class Plane extends Transport {
    public Plane(){
        super(900, 100000); //создали дефолт конструктор со словом супер, благодаря которому можно проставить значения приватным полям, к которым не обратиться без слова супер
    }

    @Override
    public void start() {
        System.out.println("Самолет полетел");
    }
}
