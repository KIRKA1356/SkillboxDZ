import EnumClass.*;

public class Main {
    public static void main(String[] args) {
        Processor intel64 = new Processor(4200,4,"Тайвань", 0.5);
        Ram ortis34 = new Ram(RamType.FLNG, 16, 0.2);
        HardDrive hddr443 = new HardDrive(HardDriveType.HDD, 450,4);
        Keyboard msi33 = new Keyboard("MSI33", KeyboardType.CERAMIC, LcdKeyboard.YES, 2.5);
        Monitor lg34 = new Monitor(MonitorType.IPS, 12.5, 5);
        Computer kagor  = new Computer("Инарос-корп", "Кагор", intel64, ortis34, hddr443, msi33, lg34);
        kagor.setSumWeight(kagor);
        System.out.println(kagor);
        System.out.println();
        Keyboard logitech45 = new Keyboard("Logitech 450", KeyboardType.PLASTIC, LcdKeyboard.NO,3);
        kagor.setKeyboard(logitech45);
        kagor.setSumWeight(kagor);
        System.out.println(kagor);
    }
}
