package practice_homework5.ArrayListTask3;

import java.util.ArrayList;
import java.util.HashSet;

public class List {
    ArrayList<String> list;
    public List(){
        this.list = new ArrayList<>();
    }
    public void addNewElement(String element){
        list.add(element);
    }
    String longestElement = "";
    void printLongestElement(){
        list.forEach(
                list1 -> {
                    if (list1.length() > longestElement.length()){
                        longestElement = list1;
                    }
                }
        );
        System.out.println(longestElement);
    }
}
