package practice6.photoEditor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.addNewAction("открыть");
        photoEditor.addNewAction("редактировать");
        photoEditor.addNewAction("осветлить");
        photoEditor.undoLastAction();
        photoEditor.printAllActions();
    }
}
