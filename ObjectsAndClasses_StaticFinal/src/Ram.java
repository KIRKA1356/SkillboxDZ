import EnumClass.RamType;

public class Ram {
    private final RamType type; //тип памяти
    private final double volume; //объем памяти
    private final double weight; //вес носителя

    public Ram(RamType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Тип: " + type + "\n" +
                "Объем: " + volume + "\n" +
                "Вес: " + weight;
    }
}
