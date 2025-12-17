package practice_homework4.botanicalGarden;

public class BotanicGarden {
    private Plant plant;
    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Лог: растение добавлено");
    }
    public void takeCare(){
        PlantInterface PlantNew = (PlantInterface) this.plant;
        PlantNew.care();
        System.out.println("Лог: за растением был произведен уход");
    }
}
