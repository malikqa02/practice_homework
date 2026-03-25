package practice_homework11.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InventoryService {
    static boolean isInventoryOpen;
    public void setIsInventoryOpen(boolean isInventoryOpen) {
        InventoryService.isInventoryOpen = isInventoryOpen;
    }
    Map<String, List<Product>> inventory = new HashMap<>();

    public void addProductToInventory(Product product) {
        if (isInventoryOpen) {
            inventory.computeIfAbsent(product.getCategory(), m -> new ArrayList<>()).add(product);
        } else {
            System.out.println("inventory is closed");
        }
    }

    public Product takeProduct(String nameOfProduct) throws OutOfStockException{ //здесь хочу получить продукт из листа из продуктов
        return inventory.values().stream() //все значения из мапы. берем все листы из продуктов и превращаевм в стрим. Stream<List<Product>>
                .flatMap(List::stream)//каждый элемент потока List<Product> превращаем в один общих поток Stream<Product>
                .filter(p -> p.getName().equals(nameOfProduct))
                .findFirst()
                .orElseThrow(() -> new OutOfStockException("no product left"));
    }

    public List<Product> getProductsByCategory1(String category) throws OutOfStockException{
        if (inventory.get(category) == null) {
            throw new OutOfStockException("в данной категории нет товаров");
        } else {
            return inventory.get(category);
        }// сделать через стрим
    }

    public List<Product> getProductsByCategory(String category) throws OutOfStockException{
        List<Product> products = inventory.values().stream() //перевели values то есть Collection<List<Product>> в Stream<List<Product>>
                .flatMap(list -> list.stream()) //превращаем каждый список list<product> в Stream<Product>
                .filter(p -> p.getCategory().equals(category))
                .toList();
        if (products.isEmpty()){
            throw new OutOfStockException("no products in this category");
        } else {
            return products;
        }
    }

    public List<Product> getProductsUnderPrice(int initialPrice) {
        List<Product> products = inventory.values().stream()
                .flatMap(list -> list.stream())
                .filter(p -> p.getPrice() < initialPrice)
                .toList();
        if (products.isEmpty()){
            throw new OutOfStockException("no products in this category");
        } else {
            return products;
        }
    }

    public static void main(String[] args) {

    }
 }


