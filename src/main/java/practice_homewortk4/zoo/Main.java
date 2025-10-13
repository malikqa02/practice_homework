package practice_homewortk4.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zooMSC = new Zoo();
        Animal Max = new Elephant(12, "Max");
        Animal Eagle = new Bird(11, "Nick");
        zooMSC.showBehavior(Eagle);
    }
}
