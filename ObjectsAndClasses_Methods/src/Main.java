public class Main {
    public static void main(String[] args) {
            Basket order01 = new Basket();
        order01.add("Картошка", 25, 2,4.0);
        order01.add("Вода",50,1,1);
        order01.add("Апельсин", 23,1,1.3);
            Basket order02 = new Basket();
        order02.add("Апельсин", 22,1,1.5);
        order02.add("Мандарин", 30,2,1);
        Basket order03 = new Basket();
            System.out.println(Basket.getAllCount());
            System.out.println(Basket.getAllPrice());
        System.out.println(Basket.getAllProduct());
        System.out.println(Basket.averagePrice());
        System.out.println(Basket.averagePriceBasket(Basket.getAllCount(),Basket.getAllPrice()));
    }
}
