import EnumClass.MonitorType;

public class Monitor {
    private final MonitorType type;//тип монитора IPS, TN, VA
    private final double diagonal;//длинна диагонали
    private final double weight;// вес монитора
    public Monitor(MonitorType type, double diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Тип: " + type + "\n" +
                "Диагональ: " + diagonal + "\n" +
                "Вес: " + weight;
    }
}
