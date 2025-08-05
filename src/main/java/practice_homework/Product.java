package practice_homework;

public class Product {
    String name;
    int price;
    public Product(String someName, int somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    String getName(){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }
    void setName(String newName){
        this.name = newName;
    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }
    void applyDiscount(int discount){
        int discountSum = this.price / 100 * discount;
        this.price -= discountSum;
    }
    void printInfo(){
        System.out.println("Товар - " + getName() + ", цена - " + getPrice());
    }
}
