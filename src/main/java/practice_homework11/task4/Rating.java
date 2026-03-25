package practice_homework11.task4;


public class Rating <T extends Number> {

    T value;

    public Rating(T value){
        double v = value.doubleValue();
        if (v < 1 || v > 10){
            throw new WrongRatingNumber("rate between 10 1");
        } else {
            this.value = value;
        }
    }

    public T getValue(){
        return value;
    }
}
