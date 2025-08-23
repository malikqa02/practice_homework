package practice4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        //parity
        System.out.println(checkParity(64545));
        //age
        System.out.println(checkAge(2));
        System.out.println(checkAge(22));
        System.out.println(checkAge(73));
        //max
        System.out.println(checkMax(144400,2888,34444444));
    }
    /**
     * Метод для проверки четности
     * @param number
     * @return
     */
    public static String checkParity(int number){
        //if-else условие
        //в методе должен быть один return
        String parity = "Нечетное";
        if (number % 2 == 0){
            parity = "Четное";
        }
        return parity;
    }

    /**
     * Метод для проверки возраста
     * @param age
     * @return
     */
    public static String checkAge(int age){
        String ageDescription = "";
        if (age < 18){
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60){
            ageDescription = "Взрослый";
        }
        if (age > 60){
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }
    /**
     * Метод для вывода наидольшего числа
     */
    public static int checkMax(int a, int b, int c){
        int maxAB = a;
        if (maxAB < b){
            maxAB = b;
        }
        int max = maxAB;
        if (maxAB < c){
            max = c;
        }
        return max;
    }
}
