class Car {
    String brand;
    double mileage;

    static int wheels = 4;

    Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void display() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", 18.5);

        c.display();
    }
}