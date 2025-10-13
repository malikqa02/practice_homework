package practice5.task1;

public abstract class Transport {
    private double speed;
    private int capacity;
    public Transport(int speed, int capacity){ //конструктор абстрактного класса, от которого не создашь объект. но этот конструктор можно использовать в классах наследниках, чтобы в них использоавть слово супер чтобв можно было обратиться к приватным полям.
        this.speed = speed;
        this.capacity = capacity;
    }
    public double getSpeed(){
        return this.speed;
    }
    public int getCapacity(){
        return this.capacity;
    }
    abstract void start();
}
