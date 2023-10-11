public class Basket {


    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeigh = 0;
    private static int allCount = 0;
    private static int allProduct = 0;
    public static int allPrice = 0;
    public static double averagePrice = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, int totalWeigh) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeigh = totalWeigh;
    }

    public static int getAllCount() {
        return allCount;
    }
    public static int getAllPrice() {
        return allPrice;
    }
    public static int getAllProduct(){return allProduct; }
    public static double getAveragePrice(){ return averagePrice; }


    public static void increaseCount(int count) {
        Basket.allCount = Basket.allCount + count;
    }
    public static void increasePrice(int totalPrice){ Basket.allPrice = Basket.allPrice + totalPrice; }
    public static void increaseProduct(int productCount){ Basket.allProduct = Basket.allProduct + productCount; }




    public void add(String name, int price) {
        add(name, price,1,0);
        add(name, price, allCount,0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        if (weight == 0) {
            items = items + "\n" + name + " - " +
                    count + " шт. - " + price;
            totalPrice = totalPrice + count * price;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + "Вес продукта: " + weight;
        totalPrice = totalPrice + (count * price);
        increasePrice(totalPrice);
        increaseProduct(1);
        clear();
        totalWeigh = totalWeigh + weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public double getTotalWeight(){
        return totalWeigh;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
    public static double averagePrice(){
        averagePrice = (double) (allPrice)/(double) (allProduct);
        return averagePrice;
    }
    public static double averagePriceBasket(int allCount, double allPrice){
        double averagePriceBasket = allPrice/(double) allCount;
        return averagePriceBasket;

    }
}
