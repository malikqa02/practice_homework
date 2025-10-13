package practice5.task2;

public class Clothes extends Item{
    public final static char DEFAULT_SIZE = 'M';
    private char size;
    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.size = DEFAULT_SIZE;
    }
    public char getSize() {
        return size;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(", размер: " + this.size);
    }
}
