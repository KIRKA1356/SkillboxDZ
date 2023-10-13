import EnumClass.KeyboardType;
import EnumClass.LcdKeyboard;

public class Keyboard {
    private final String name;
    private final KeyboardType type;
    private final LcdKeyboard lcd;
    private final double weight;
    public Keyboard(String name, KeyboardType type, LcdKeyboard lcd, double weight) {
        this.name = name;
        this.type = type;
        this.lcd = lcd;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Наименование: " + name + "\n" +
                "Тип клавишь: " + type + "\n" +
                "Наличие LCD подсветки: " + lcd + "\n" +
                "Вес " + weight;
    }
}
