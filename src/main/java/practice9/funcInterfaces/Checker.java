package practice9.funcInterfaces;

@FunctionalInterface
public interface Checker {
    //проверка удовлетворяет ли число условию
    //метод по умолчанию печатает число если оно прошло проверку
    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }

}
