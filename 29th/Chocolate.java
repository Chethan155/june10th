class Chocolate {
    String name = "Milk Chocolate";
    int pieces;
    String ingredients;
    int price = 10;

    Chocolate() {
        System.out.println("Running the default constructor");
    }
}

class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate ref = new Chocolate();

        System.out.println("The chocolate name is: " + ref.name);
        System.out.println("The number of pieces you can eat is: " + ref.pieces);
        System.out.println("The price of the chocolate is: " + ref.price);
        System.out.println("Ingredients used to prepare chocolate: " + ref.ingredients);
    }
}