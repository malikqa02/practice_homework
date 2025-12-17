package practice_homework4.restaurant;

public class MainDish extends Dish {
    private int temperature;

    public MainDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    void showCharacteristics() {
        System.out.println("Температура горячего блюда " + this.temperature);
    }
}
