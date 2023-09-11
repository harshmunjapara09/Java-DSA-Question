package Oops2;

public class Oops1 {
    public static void main (String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bicycle.changeGear(3);
        bike.changeGear(4);
        car.changeGear(6);
    }
}

 interface Vehicle {
    void changeGear(int gear);
}

 class Bicycle implements Vehicle {
     static final int MAX_GEAR = 2;
    public void changeGear(int gear) {
        if (gear < 1 || gear > MAX_GEAR) {
            System.out.println("Invalid gear for Bicycle.");
        } else {
            System.out.println("Bicycle gear changed to " + gear + ".");
        }
    }
}

 class Bike implements Vehicle {
     static final int MAX_GEAR = 5;
    public void changeGear(int gear) {
        if (gear < 1 || gear > MAX_GEAR) {
            System.out.println("Invalid gear for Bike.");
        } else {
            System.out.println("Bike gear changed to " + gear + ".");
        }
    }
}

 class Car implements Vehicle {
     static final int MAX_GEAR = 7;
    public void changeGear(int gear) {
        if (gear < 1 || gear > MAX_GEAR) {
            System.out.println("Invalid gear for Car.");
        } else {
            System.out.println("Car gear changed to " + gear + ".");
        }
    }
}

