package practice_homewortk4.amusementPark;

public class AmusementPark {
    private Attraction attraction; //вопрос: как реализовать систему так, чтоб можно было добавить много аттракционов?

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    protected void startAttraction() {
        attraction.start();
    }

    protected void stopAttraction() {
        attraction.stop();
    }

    protected void showInfo() {
        attraction.info();
    }
}

