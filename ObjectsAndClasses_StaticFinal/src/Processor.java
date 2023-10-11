public class Processor {
    private final double frequency;//частота процессора
    private final int numberOfCores; //кол-во ядер
    private final String manufacturer;//производитель
    private final double weight;//вес

    public Processor(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Частота процессора: " + frequency + "\n" +
                "Кол-во ядер: " + numberOfCores + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Вес: " + weight;
    }
}
