package practice4.solvers;

import practice4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(6));
        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.AUTUMN));
    }
    public static String dayOfWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1 -> dayOfWeek = "Понедельник";
            case 2 -> dayOfWeek = "Вторник";
            case 3 -> dayOfWeek = "Среда";
            case 4 -> dayOfWeek = "Четверг";
            case 5 -> dayOfWeek = "Пятница";
            case 6 -> dayOfWeek = "Суббота";
            case 7 -> dayOfWeek = "Воскресенье";
            default -> dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }
    public static String describeSeason(Season season){
        String description = "";
        switch (season) {
            case WINTER -> description = "холод";
            case SPRING -> description = "теплее";
            case SUMMER -> description = "жарко";
            case AUTUMN -> description = "дожди";
        }
        return description;
    }
}
