package practice_homework4.amusementPark;

public class Carousel extends Attraction implements Checkable {
    @Override
    void start() {
        System.out.println("Карусель запущена");
    }

    @Override
    void stop() {
        System.out.println("Карусель остановлена");
    }

    @Override
    void style() {
        System.out.println("Спокойный стиль");
    }

    @Override
    void info() {
        System.out.println("информация по тех. обслуживанию и проверке безопасности: ");
        serviceCheck();
        safetyCheck();
        System.out.println("Стиль: ");
        style();
    }

    @Override
    public void serviceCheck() {
        System.out.println("нужно частое техническое обслуживание");
    }

    @Override
    public void safetyCheck() {
        System.out.println("нужна обычная проверка безопасности");
    }
}
