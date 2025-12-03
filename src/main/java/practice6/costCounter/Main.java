package practice6.costCounter;

public class Main {
    public static void main(String[] args) {
        CostCounter costcounter = new CostCounter();
        costcounter.addCosts(1, 123.21);
        costcounter.addCosts(2, 13.24);
        costcounter.addCosts(3, 132.214);
        costcounter.addCosts(4, 1332.214);
        System.out.println(costcounter.getCosts(3));
        System.out.println(costcounter.minCostsMonth());
    }
}
