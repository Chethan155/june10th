class Oil {
    String name;
    int price;
    boolean quality;
    String shop;
    String location;

    Oil() {
        System.out.println("running no argument oil");
    }

    Oil(String name, int price, boolean quality, String shop, String location) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.shop = shop;
        this.location = location;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quality: " + this.quality);
        System.out.println("Shop: " + this.shop);
        System.out.println("Location: " + this.location);
    }
}

class OilRunner {
    public static void main(String[] args) {
        Oil oil = new Oil();
        oil.display();

        Oil oil1 = new Oil("suraj", 199, true, "oilshop", "dubai");
        oil1.display();

        System.out.println("Updating data");
        oil1.name = "sharath";
        oil1.price = 150;
        oil1.quality = false;
        oil1.shop = "shop";
        oil1.location = "saudi";

        oil1.display();
    }
}
