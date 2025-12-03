package practice_homework5.HashSetTask4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        NameScanner nameScanner = new NameScanner();
        names.add("Misha");
        names.add("Sasha");
        names.add("Vanya");
        if (names.contains(nameScanner.nameScan()) == true) {
            System.out.println("Имя есть в списке");
        } else {
            System.out.println("Имени нет в списке");
        }
    }
}
