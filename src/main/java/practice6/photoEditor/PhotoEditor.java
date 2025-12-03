package practice6.photoEditor;

import java.util.Stack;

public class PhotoEditor {
    //хранить последние действия
    private Stack<String> actions;
    public PhotoEditor(){
        this.actions = new Stack<>();
    }
    //добавить действия
    public void addNewAction(String action){
        actions.push(action);
    }
    //откатить последние действие
    public void undoLastAction(){
        actions.pop();
    }
    //распечатать все действия
    public void printAllActions(){
        System.out.println("Действия: ");
        actions.forEach(
                System.out::println
        );
        System.out.println();
    }
}
