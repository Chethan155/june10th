class Toothpaste {
    int weight;
    String brand;
    String flavor;
    boolean whitening;
    double price;
    char symbol;
    long quantity;

    public Toothpaste(int weight, String brand, String flavor, boolean whitening, double price,
            char symbol, long quantity) {
        this.weight = weight;
        this.brand = brand;
        this.flavor = flavor;
        this.whitening = whitening;
        this.price = price;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void printInstanceVariables() {
        System.out.println("Weight: " + weight + " g");
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Whitening: " + whitening);
        System.out.println("Price: $" + price);
        System.out.println("Symbol: " + symbol);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Toothpaste toothpaste1 = new Toothpaste(100, "Brand1", "Mint", true, 4.99, 'A', 50L);
        Toothpaste toothpaste2 = new Toothpaste(75, "Brand2", "Cinnamon", false, 3.49, 'B', 100L);
        Toothpaste toothpaste3 = new Toothpaste(125, "Brand3", "Strawberry", true, 5.99, 'C', 75L);
        Toothpaste toothpaste4 = new Toothpaste(90, "Brand4", "Bubblegum", false, 2.99, 'D', 150L);
        Toothpaste toothpaste5 = new Toothpaste(110, "Brand5", "Spearmint", true, 6.99, 'E', 125L);
        Toothpaste toothpaste6 = new Toothpaste(80, "Brand6", "Peppermint", false, 4.49, 'F', 200L);
        Toothpaste toothpaste7 = new Toothpaste(95, "Brand7", "Vanilla", true, 3.99, 'G', 175L);
        Toothpaste toothpaste8 = new Toothpaste(105, "Brand8", "Lemon", false, 5.49, 'H', 250L);

        toothpaste1.printInstanceVariables();
        toothpaste2.printInstanceVariables();
        toothpaste3.printInstanceVariables();
        toothpaste4.printInstanceVariables();
        toothpaste5.printInstanceVariables();
        toothpaste6.printInstanceVariables();
        toothpaste7.printInstanceVariables();
        toothpaste8.printInstanceVariables();
    }
}
