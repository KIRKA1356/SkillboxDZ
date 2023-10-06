public class Dimensions {
    private int width; //Ширина
    private int length; //Длинна
    private int height; //Высота

    public Dimensions(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width, length, height);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(width, length, height);
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(width, length, height);
    }

    public int Volume(int width, int length, int height){
       int volume = width * length * height;
       return volume;
    }

    @Override
    public String toString() {
        return "Ширина: "  + width + ", " +
                "Длинна: "  + length + ", " +
                "Высота: "  + height + ", " +
                "Объем: " + Volume(width,length,height);
    }
}
