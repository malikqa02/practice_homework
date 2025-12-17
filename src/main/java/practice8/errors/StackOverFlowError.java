package practice8.errors;

public class StackOverFlowError {
    public static void recursivePrint(int num){ //рекурсия это когда вызываем метод, и он сам себя вызывает
        System.out.println(num);
        recursivePrint(num + 1);

    }
    public static void main(String[] args) {
        recursivePrint(1);
    }
}
