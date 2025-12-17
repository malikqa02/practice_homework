package practice_homework4.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zooMSC = new Zoo();
        Animal Max = new Elephant(12, "Max");
        Animal Eagle = new Bird(11, "Nick");
        zooMSC.addAnimal(Max);
        zooMSC.showBehavior();
        zooMSC.removeAnimal();
        zooMSC.addAnimal(Eagle);
        //zooMSC.showBehavior();
    }
}
