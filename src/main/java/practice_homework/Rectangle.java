package practice_homework;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }
    int getWidth() {
        return this.width;
    }
    int getHeight() {
        return this.height;
    }
    void setWidth(int newWidth){
        this.width = newWidth;
    }
    int calculateArea() {
        int a = width * height;
        System.out.println("Площадь равна = " + a);
        return a;
    }


}
