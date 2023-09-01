public class Arithmetic {
    private int firstNumber;
    private int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public int amount() {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int  productOfNumbers() {
        int product = firstNumber * secondNumber;
        return product;
    }

    public int maxNumber() {
        if (firstNumber>secondNumber)
            return firstNumber;
        return secondNumber;
    }

    public int minNumber() {
        if (firstNumber<secondNumber)
            return firstNumber;
        return secondNumber;
    }


}
