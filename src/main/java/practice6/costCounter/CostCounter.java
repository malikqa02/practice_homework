package practice6.costCounter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив. индекс = месяц
    private ArrayList<Double> costsPerMonth;

    public CostCounter(){ //инициализируем arraylist costsperMonth в конструкторе при создании класса
        this.costsPerMonth = new ArrayList<>();
    }
    //метод добавления месяца расходов в месяц
    public void addCosts(int month, double costs){ //-1 потому что индекс начинается с 0, а нам надо с 1
        costsPerMonth.add(month-1, costs);
    }
    //метод получения значения расходов по месяцу
    public Double getCosts(int month){
        return costsPerMonth.get(month-1);
    }
    // считать месяц с минимальным расходом
    public double minCostsMonth(){
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.get(0)); //взяли мин значение - январь. если что то будет меньше - обновим значенме
        costsPerMonth.forEach(
                costsPerMonth -> { //тут costsPerMonth это один элемент и в скобках указываем что делаем с каждым элементом
                    if (costsPerMonth < min.get()){
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }
}
