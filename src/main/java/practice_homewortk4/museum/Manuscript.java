package practice_homewortk4.museum;

public class Manuscript extends Exhibit {

    @Override
    protected void handle() {
        System.out.println("манускрипту необходима влажность не выше определенного уровня");
    }

    @Override
    protected void info() {
        System.out.println("манускрипту 1000 лет");
    }
}
