import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            if (-3<=floor && floor<=26)
            elevator.movefloor(floor);
            else System.out.println("Ошибка, такого этажа нет");
        }
    }
}
