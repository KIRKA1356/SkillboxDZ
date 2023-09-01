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



     }
 }