package practice_homework11.task5;

public class Product {
    String name;
    String category;
    int price;

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "{product - " + name + ", categoory - " + category + ", price - " + price + "}";
    }
}
