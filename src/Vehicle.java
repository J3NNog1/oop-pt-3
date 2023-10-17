class Vehicle {
    private String brand;
    private String model;
    private int year;
    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void start() {
        System.out.println("The vehicle is starting.");
    }
    public void stop() {
        System.out.println("This vehicle is stopping.");
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
class Car extends Vehicle {
    private int numDoors;
    public Car(String brand, String model, int year, int numDoors) {
    super(brand, model, year);
    this.numDoors = numDoors;
    }
    public void honk(){
        System.out.println("Honk! Honk!");
    }
}
class Motorcycle extends Vehicle {
    private boolean hasHelmet;
    public Motorcycle(String brand, String model, int year, boolean hasHelmet) {
        super(brand, model, year);
        this.hasHelmet = hasHelmet;

    }
    public void wheelie() {
        System.out.println("I just did a wheelie!");
    }
}

class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String brand, String model, int year, double payloadCapacity){
        super(brand, model, year);
        this.payloadCapacity = payloadCapacity;

    }
    public void loadCargo() {
        System.out.println("Loading cargo into the truck.");
    }
}

