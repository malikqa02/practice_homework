package practice7;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //проверяем, не сравниваемся ли мы с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; //если объект с которым сравниваемся равен нулю, то два объекта не равны. ИЛИ ('||') класс текущего объекта не равен с классом объекта, с которым сравниваемся, то два объекта не равны
        Person that = (Person) obj; //мы объект который передали, приводим к классу Person (прикастовываем)
        // а тут уже сравниваем по имени и возрасту
        return this.name.equals(that.name) && this.age.equals(that.age);
   }

   @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0; //код: если имя не равно нулю то у name вызовется hashCode(), а если равно нулю то result = 0
       return result * 31 + age; // у age нет метода hashCode, result умножается на 31, чтобы избежать коллизии, и добавляем age
   }

   @Override
    public Person clone(){
        return new Person(this.name, this.age);
   }
}