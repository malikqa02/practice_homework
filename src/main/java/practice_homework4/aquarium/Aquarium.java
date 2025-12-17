package practice_homework4.aquarium;

public class Aquarium {
    private SeaAnimal seaAnimal;
    public void addAnimal(SeaAnimal seaAnimal){
        this.seaAnimal = seaAnimal;
        System.out.println("Лог: животное добавлено");
    }
    public void showBehavior(){
        this.seaAnimal.move();
        System.out.println("Лог: поведение отображено");
    }
}
