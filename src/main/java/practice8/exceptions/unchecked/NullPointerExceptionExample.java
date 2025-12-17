package practice8.exceptions.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int b = text.length();
        } catch (NullPointerException e){
            System.out.println("попытка вывести у null метод");
        }
    }
}
