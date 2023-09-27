public class Main {
     public static void main(String[] args) {

         Arithmetic sumPrimer = new Arithmetic(9, 5);

         int sum = sumPrimer.amount();
         int product = sumPrimer.productOfNumbers();
         int maxNumber = sumPrimer.maxNumber();
         int minNumber = sumPrimer.minNumber();
         System.out.println("\n" + "Сумма чисел = " + sum);
         System.out.println("\n" + "Произведение числел равно = " + product);
         System.out.println("\n" + "Максимальное число = " + maxNumber);
         System.out.println("\n" + "Минимальное число = " + minNumber);

         Basket vasyaBasket  =new Basket();
         vasyaBasket.add("шоколадка", 120, 2, 2);
         vasyaBasket.add("Газировка", 220, 2, 0.5);
         System.out.println(vasyaBasket.getTotalWeight());




     }
 }