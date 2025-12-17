package practice_homework4.restaurant;

public class Restaurant {
    private Dish dish;
    public void addDish(Dish dish){
        this.dish = dish;
        System.out.println("лог: Блюдо добавлено");
    }
    public void showCharacteristics(){
        this.dish.showCharacteristics();
        System.out.println("лог: Характеристики показаны");
    }
}