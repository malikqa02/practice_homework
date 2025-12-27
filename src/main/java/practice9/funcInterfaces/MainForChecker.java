package practice9.funcInterfaces;

public class MainForChecker {
    public static void main(String[] args) {
        Checker isPositive = n -> n > 0;
        isPositive.printIfValid(5);
    }
}
