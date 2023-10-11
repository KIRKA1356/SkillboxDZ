public class MMain {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            if (-3<=floor && floor<=26)
//            elevator.movefloor(floor);
//            else System.out.println("Ошибка, такого этажа нет");
//        }
        Dimensions demOrder01 = new Dimensions(3,1,3);
        CargoInformation order01 = new CargoInformation(demOrder01,
                                                        500,
                                                        "ул.Карпинского 43",
                                                        false,
                                                        "04B34c3",
                                                        true);
        CargoInformation order02 = new CargoInformation();
        order02.setDeliveryAddress("ул.Комисаржевской 32");
        System.out.println(order02);
        order02.setRegistrationNumber("9845f37f");
        Dimensions demOrder02 = new Dimensions(4,5,2);
        order02.setDimensions(demOrder02);
        order02.setWeight(4587);
        System.out.println(order02);


        


    }
}
