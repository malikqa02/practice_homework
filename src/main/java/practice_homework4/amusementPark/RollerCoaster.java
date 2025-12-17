package practice_homework4.amusementPark;

public class RollerCoaster extends Attraction implements Checkable {
    @Override
    void start() {
        System.out.println("Американские горки запущены");
    }

    @Override
    void stop() {
        System.out.println("Американские горки остановлены");
    }

    @Override
    void style() {
        System.out.println("Активный стиль");
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
        System.out.println("нужно обычное техническое обслуживание");
    }

    @Override
    public void safetyCheck() {
        System.out.println("нужна повышенная проверка безопасности");
    }
}
