class Bun {
    String name = "Cinnamon Bun";
    int pieces;
    String ingredients;
    int price = 10;

    Bun() {
        System.out.println("Running the default constructor");
    }
}

class BunRunner {
    public static void main(String[] args) {
        Bun ref = new Bun();

        System.out.println("The bun name is: " + ref.name);
        System.out.println("The number of pieces you can eat is: " + ref.pieces);
        System.out.println("The price of the bun is: " + ref.price);
        System.out.println("Ingredients used to prepare the bun are: " + ref.ingredients);
    }
}