class Metro {
    String line;
    int distance;
    String start;
    String destination;
    int capacity;

    Metro(String line) {
        System.out.println("Metro is running with String argument:");
        this.line = line;
    }

    Metro(String line, int distance) {
        this(line);
        System.out.println("Metro is running with String and int:");
        this.distance = distance;
    }

    Metro(String line, int distance, String start) {
        this(line, distance);
        System.out.println("Metro is running with String, int, and String:");
        this.start = start;
    }

    Metro(String line, int distance, String start, String destination) {
        this(line, distance, start);
        System.out.println("Metro is running with String, int, String, and String:");
        this.destination = destination;
    }

    Metro(String line, int distance, String start, String destination, int capacity) {
        this(line, distance, start, destination);
        System.out.println("Metro is running with String, int, String, String, and int:");
        this.capacity = capacity;
    }
}

class MetroRunner {
    public static void main(String[] args) {
        System.out.println("Running main...");
        Metro train = new Metro("Purple", 55, "Kengeri", "Bayappanahalli", 2500);

        System.out.println("Line: " + train.line);
        System.out.println("Distance: " + train.distance);
        System.out.println("Start: " + train.start);
        System.out.println("Destination: " + train.destination);
        System.out.println("Capacity: " + train.capacity);
    }
}
