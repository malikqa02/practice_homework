package practice_homework;

public class Point {
    float x;
    float y;

    public Point(float someX, float someY) {
        this.x = someX;
        this.y = someY;
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    void setX(float newX) {
        this.x = newX;
    }
    void print(){
        System.out.println("Координаты X: " + getX() + ", Координаты Y: " + getY());
    }

}