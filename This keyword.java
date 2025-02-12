class Car {
    String brand;
    String model;
    
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry"); 
        myCar.display(); 
    }
}