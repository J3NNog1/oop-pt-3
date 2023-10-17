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
}
