public class CargoInformation {
    private final Dimensions dimensions; //габариты

    private final int weight; //вес

    private final String deliveryAddress; //адрес доставки

    private final boolean property; //смена положения груза

    private  final String registrationNumber; //регистрационный номер

    private final boolean fragility;  //хрупкость


    public CargoInformation(Dimensions dimensions,
                            int weight,
                            String deliveryAddress,
                            boolean property,
                            String registrationNumber,
                            boolean fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.fragility = fragility;
    }

    public CargoInformation() {

        registrationNumber = null;
        deliveryAddress = null;
        property = false;
        weight = 0;
        dimensions = null;
        fragility = false;
    }
    

    public CargoInformation setDimension(Dimensions dimensions) {
        return new CargoInformation(dimensions, weight, deliveryAddress, property, registrationNumber, fragility);
    }


    public CargoInformation setWidth(int weight) {
        return new CargoInformation(dimensions, weight, deliveryAddress, property, registrationNumber, fragility);
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(dimensions, weight, deliveryAddress, property, registrationNumber, fragility);
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(dimensions, weight, deliveryAddress, property, registrationNumber, fragility);
    }


    @Override
    public String toString() {
        String prop = "";
        String frag = "";
        if (property == true) {
            prop = "Да";
        }
        else prop = "Нет";
        if (fragility == true){
            frag = "Да";
        }
        else frag = "Нет";
        if (property && fragility == Boolean.parseBoolean(null)){
            prop = "----";
            frag = "----";
        }
        return "Заказ №01" + "\n" +
                "Габариты:" + dimensions +"\n"+
                "Вес:" + weight + "\n"+
                "Адрес Доставки:" + deliveryAddress + "\n" +
                "Разрешение на смену положения груза:" + prop + "\n" +
                "Регистрационный номер:" + registrationNumber + "\n" +
                "Хрупкость груза:" + frag;
    }
}
