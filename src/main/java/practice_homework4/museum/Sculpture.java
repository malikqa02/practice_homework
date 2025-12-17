package practice_homework4.museum;

public class Sculpture extends Exhibit{
    @Override
    protected void handle() {
        System.out.println("Скульптура нуждается в реставрации");
    }

    @Override
    protected void info() {
        System.out.println("скульптуре 600 лет");
    }
}
