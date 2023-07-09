class FireExtinguisher {
    String name;
    String location;
    int weight;
    int height;

    FireExtinguisher(String name1, String location1, int weight1, int height1) {
        this.name = name1;
        this.location = location1;
        this.weight = weight1;
        this.height = height1;
    }

    void fire() {
        System.out.println(this.name);
        System.out.println(this.location);
        System.out.println(this.weight);
        System.out.println(this.height);
    }
}

class FireExtinguisherRunner {
    public static void main(String[] args) {
        FireExtinguisher ref = new FireExtinguisher("fire1", "kengeri", 2, 30);
        System.out.println("running FireExtinguisherRunner");
        ref.fire();

        ref.name = "fire2";
        ref.location = "bidadi";
        ref.weight = 34;
        ref.height = 20;
        ref.fire();
    }
}
