package practice7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali", 12);
        //переопределили toString()
        System.out.println(person.toString());
        //сравнение типов данных (примитивные сравниваются через ==)
        //в ссылочные через equals (когда есть ссылка на объект)
        Person person2 = new Person("Ali", 12);
        System.out.println(person.equals(person2));
        System.out.println(person2.equals(person));
        Person clonePerson = person2.clone();
        System.out.println(clonePerson.toString());
    }
}
