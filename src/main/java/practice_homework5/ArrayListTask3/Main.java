package practice_homework5.ArrayListTask3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.addNewElement("a");
        list.addNewElement("ab");
        list.addNewElement("abc");
        String longestElement = "";
        list.printLongestElement();
    }
}
