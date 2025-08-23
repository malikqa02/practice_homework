package practice4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        multiplyTable(2);
        System.out.println(sumOfAllNumber(4));
        System.out.println(checkSimpleNumbers(6));
        printSimpleNumbersBefore100();
    }
    public static void multiplyTable(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
    public static int sumOfAllNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;

    }
    public static boolean checkSimpleNumbers(int number){
        boolean isSimple = true;
        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
    public static void printSimpleNumbersBefore100(){
        for (int i = 2; i <= 100; i++){
            if (checkSimpleNumbers(i)){
                System.out.println(i);
            }
        }
    }
}
