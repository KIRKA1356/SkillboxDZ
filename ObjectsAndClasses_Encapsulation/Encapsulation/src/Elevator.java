public class Elevator {
    private int currentFloor = 1; //текущий этаж
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown(int currentFloor) {
        return currentFloor - 1;
    }

    public int moveUp(int currentFloor) {
        return currentFloor + 1;
    }

    public void movefloor(int floor) {
        if (currentFloor > floor)
            for (int i = currentFloor; i == floor; ) {
                moveDown(i);
                if (i == floor) {
                    System.out.println("Этаж: " + floor);
                    setCurrentFloor(floor);
                    break;
                }

            }

        if (currentFloor < floor)
            for (int i = currentFloor; i == floor; ) {
                moveUp(i);
                if (i == floor) {
                    System.out.println("Этаж: " + floor);
                    setCurrentFloor(floor);
                    break;
                }
            }
    }
}



