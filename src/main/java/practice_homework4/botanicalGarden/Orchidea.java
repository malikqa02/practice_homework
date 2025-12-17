package practice_homework4.botanicalGarden;

public class Orchidea extends Plant implements PlantInterface {
    @Override
    public void care() {
        System.out.println("Уход за орхидеей: высокая влажность и тень");
    }
}
