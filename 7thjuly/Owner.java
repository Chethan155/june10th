class Owner {
    String name;
    int age;
    String place;
    String shop;
    String location;

    Owner(String name, int age, String place, String shop, String location) {
        System.out.println("running String int String String String arg in Owner");
        this.name = name;
        this.age = age;
        this.place = place;
        this.shop = shop;
        this.location = location;
    }

    void ownerstatus() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.place);
        System.out.println(this.shop);
        System.out.println(this.location);
    }
}

class OwnerRunner {
    public static void main(String[] args) {
        Owner nn = new Owner("chethan", 21, "mysore", "MRP", "siddartha layout");
        nn.ownerstatus();

        nn.name = "putta";
        nn.age = 22;
        nn.place = "banglore";
        nn.shop = "kapikatte";
        nn.location = "rr nagar";
        nn.ownerstatus();
    }
}
