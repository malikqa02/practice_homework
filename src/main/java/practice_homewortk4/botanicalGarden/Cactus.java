package practice_homewortk4.botanicalGarden;

public class Cactus extends Plant implements PlantInterface {

    @Override
    public void care() {
        System.out.println("уход за кактусом: много света, редкий полив");
    }
}
