public class Computer {
    private final String vendor;
    private final String name;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private Keyboard keyboard;
    private Monitor monitor;
    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(String vendor, String name, Processor processor, Ram ram, HardDrive hardDrive, Keyboard keyboard, Monitor monitor) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "  Компьютер от производителя: " +
                vendor + '\n' +
                "  Имя компютера: " + name + '\n' +
                "  Процессор: " + processor + '\n' +
                "  ОЗУ: " + ram + '\n' +
                "  Жесткий диск: " + hardDrive + '\n' +
                "  Клавиатура: " + keyboard + '\n' +
                "  Монитор: " + monitor;
    }
}
