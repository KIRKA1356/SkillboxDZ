import EnumClass.HardDriveType;

public class HardDrive {
    private final HardDriveType type;//тип жесткого диска HDD или SSD
    private final double volume; //объем памяти
    private final double weight; //вес носителя

    public HardDrive(HardDriveType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n" + "ТТХ ЖМД" + "\n" +
                "Тип: " + type + "\n" +
                "Объем: " + volume + "\n" +
                "Вес носителя: " + weight;
    }
}
