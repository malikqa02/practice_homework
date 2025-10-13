package practice5.task1;

public class Dispatcher {
    public void control(Transport transport){ //принимает объект "транспорт" типа "транспорт" и у объекта вызывает его метод
        transport.start();
    }
    public void printTransportDetails(Transport transport){
        System.out.println("Скорость транспорта: " + transport.getSpeed());
        System.out.println("Вместительность транспорта: " + transport.getCapacity());
    }
}
