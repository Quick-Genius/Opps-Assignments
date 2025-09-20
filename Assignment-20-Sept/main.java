

class Laptop{
    String brand;
    String model;
    double price;
    int ramSize;
    public Laptop(){
        this.brand = "Unknown";
        this.model = "Generic Model";
        this.price = 0.0;
        this.ramSize = 4;
    }
    public Laptop(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
        this.ramSize = 4;
    }
    public Laptop(String brand, String model, double price, int ramSize){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
    }
    public void displayDetails(){
        System.out.println("Brand: " + this.brand + "Model: " + this.model +
                "Price: " + this.price + "RAM Size: " + this.ramSize);
    }
}

class main{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Apple" , "MacBook M2");
        Laptop laptop3 = new Laptop("Apple" , "MacBook M2", 79900, 16 );
        laptop1.displayDetails();
        laptop2.displayDetails();
        laptop3.displayDetails();


    }
}