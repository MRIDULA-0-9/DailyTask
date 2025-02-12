class Car {
    String brand;
    String model;
    double price;

  public  Car(String a,String b,double c) {
        brand = a;
        model = b;
        price = c;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 30000);
        myCar.display();
    }
}