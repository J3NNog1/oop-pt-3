

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 2018, 4);
        myCar.start();
        myCar.honk();
        myCar.stop();
        myCar.displayInfo();

        Motorcycle myMotorcycle = new Motorcycle("Kawasaki", "Ninja", 2017, true);
        myMotorcycle.start();
        myMotorcycle.wheelie();
        myMotorcycle.stop();
        myMotorcycle.displayInfo();

        Truck myTruck = new Truck("MCI", "Charter", 2017, 896);
        myTruck.start();
        myTruck.loadCargo();
        myTruck.stop();
        myTruck.displayInfo();

        Plane myPlane = new Plane("Boeing", "757", 2024, true);
        myPlane.start();
        myPlane.flying();
        myPlane.stop();
        myPlane.displayInfo();
    }
}