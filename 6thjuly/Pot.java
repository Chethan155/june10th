class Pot {
    int diameter;
    int height;
    String color;
    String material;
    boolean drainageHoles;
    double price;
    char symbol;
    long quantity;

    public Pot(int diameter, int height, String color, String material, boolean drainageHoles, double price,char symbol, long quantity) {
        this.diameter = diameter;
        this.height = height;
        this.color = color;
        this.material = material;
        this.drainageHoles = drainageHoles;
        this.price = price;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void printInstanceVariables() {
        System.out.println("diameter: " + diameter);
        System.out.println("height: " + height);
        System.out.println("color: " + color);
        System.out.println("material: " + material);
        System.out.println("drainageHoles: " + drainageHoles);
        System.out.println("price: " + price);
        System.out.println("symbol: " + symbol);
        System.out.println("quantity: " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Pot pot1 = new Pot(12, 10, "Terracotta", "Clay", true, 29.99, 'A', 100L);
        Pot pot2 = new Pot(8, 6, "White", "Ceramic", false, 19.99, 'B', 200L);
        Pot pot3 = new Pot(14, 12, "Black", "Plastic", true, 12.99, 'C', 150L);
        Pot pot4 = new Pot(10, 8, "Blue", "Porcelain", false, 24.99, 'D', 250L);
        Pot pot5 = new Pot(16, 14, "Green", "Fiberglass", true, 39.99, 'E', 300L);
        Pot pot6 = new Pot(18, 16, "Yellow", "Metal", false, 49.99, 'F', 350L);
        Pot pot7 = new Pot(20, 18, "Red", "Concrete", true, 59.99, 'G', 400L);
        Pot pot8 = new Pot(22, 20, "Purple", "Resin", false, 69.99, 'H', 450L);

        pot1.printInstanceVariables();
        pot2.printInstanceVariables();
        pot3.printInstanceVariables();
        pot4.printInstanceVariables();
        pot5.printInstanceVariables();
        pot6.printInstanceVariables();
        pot7.printInstanceVariables();
        pot8.printInstanceVariables();
    }
}
