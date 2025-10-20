package practice_homewortk4.petsnew;

public class PetSystem {
    private Pet pet;
    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("лог: Добавили животное");
    }
    public void feedPet(){
        this.pet.eat();
        System.out.println("лог: Покормили животное");
    }
    public void forcePetToPlay(){ //так как у pet нет play(), если добавленный pet является инстансом Playable, то мы это животное кастованием приводим к Playable, чтоб вызвать этот метод
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        }
        else {
            System.out.println("Ошибка: животное не играет");
        }
    }
    public void forcePetToWalk(){
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        }
        else {
            System.out.println("Ошибка: животное не гуляет");
        }
    }
}
