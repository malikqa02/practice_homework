package practice_homework5.LinkedHashSetTask2;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void addUniqueElement(LinkedHashSet<String> set, String element){
        if (set.contains(element) == true){
            System.out.println("Элемент не добавлен, так как уже есть в списке");
        } else {
            set.add(element);
            System.out.println("Элемент добавлен");
        }
    }
    public static void main(String[] args) {
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
        addUniqueElement(linkedhashset, "asdadsdas");
        addUniqueElement(linkedhashset, "asdadsdas");
    }
}
