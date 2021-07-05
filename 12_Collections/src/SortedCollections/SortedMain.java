package SortedCollections;

import java.util.Map;

public class SortedMain {

    private static StockList stockList = new StockList();

    /**
     * Linked hash map and linked hash set are also sorted versions of map and set interfaces.
     * Sorted map and sorted set are implemented in tree map and tree set. Because the
     * operations on sets and maps are so similar we can just focus on one.
     *
     * Items in Hashmaps are stored in random order. LinkedHashMap is ordered (order it was
     * added).
     */

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 120);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.3, 15);
        stockList.addStock(temp);

        temp = new StockItem("Meat", 50, 500);
        stockList.addStock(temp);

        temp = new StockItem("Car", 50, 50000);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 3, 12);
        stockList.addStock(temp);

        temp = new StockItem("Desk", 3, 120);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 23, 75);
        stockList.addStock(temp);

        temp = new StockItem("Lamp", 2, 15);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 7, 32);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 8, 150); //adding Cake again, will not work
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket tempBasket = new Basket("John Doe");
        sellItem(tempBasket, "Meat", 2);
        System.out.println(tempBasket);

        sellItem(tempBasket, "Cake", 2);
        System.out.println(tempBasket);

        if(sellItem(tempBasket, "car", 1) != 1) {
            System.out.println("there are no more cars in store");
        }

        sellItem(tempBasket,"Lamp", 1);
        sellItem(tempBasket, "Vase", 2);
        System.out.println(tempBasket);

        sellItem(tempBasket, "Juice", 3);
        System.out.println(tempBasket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp); //will return an error due to the unmodifiable map
        stockList.Items().get("Car").adjustStock(2000);
        stockList.get("Car").adjustStock(-2050);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
