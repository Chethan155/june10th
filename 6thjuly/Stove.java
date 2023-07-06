class Stove {
    int numberOfBurners;
    String brand;
    String color;
    boolean hasOven;
    double price;
    char symbol;
    long quantity;

    public Stove(int numberOfBurners, String brand, String color, boolean hasOven, double price,
            char symbol, long quantity) {
        this.numberOfBurners = numberOfBurners;
        this.brand = brand;
        this.color = color;
        this.hasOven = hasOven;
        this.price = price;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void printInstanceVariables() {
        System.out.println("Number of Burners: " + numberOfBurners);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Has Oven: " + hasOven);
        System.out.println("Price: $" + price);
        System.out.println("Symbol: " + symbol);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Stove stove1 = new Stove(4, "Brand1", "Black", true, 799.99, 'A', 50L);
        Stove stove2 = new Stove(6, "Brand2", "Stainless Steel", true, 999.99, 'B', 100L);
        Stove stove3 = new Stove(2, "Brand3", "White", false, 499.99, 'C', 75L);
        Stove stove4 = new Stove(5, "Brand4", "Silver", true, 899.99, 'D', 150L);
        Stove stove5 = new Stove(3, "Brand5", "Red", false, 599.99, 'E', 125L);
        Stove stove6 = new Stove(4, "Brand6", "Blue", true, 699.99, 'F', 200L);
        Stove stove7 = new Stove(6, "Brand7", "Gray", true, 899.99, 'G', 175L);
        Stove stove8 = new Stove(2, "Brand8", "Green", false, 449.99, 'H', 250L);

        stove1.printInstanceVariables();
        stove2.printInstanceVariables();
        stove3.printInstanceVariables();
        stove4.printInstanceVariables();
        stove5.printInstanceVariables();
        stove6.printInstanceVariables();
        stove7.printInstanceVariables();
        stove8.printInstanceVariables();
    }
}
