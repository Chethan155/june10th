class Plate{
	
	int diameter;
	String color;
	String material;
	boolean hasPattern;
	double price;
	char symbol;
	long quantity;
	
	
	public Plate(int diameter,String color,String material,boolean hasPattern, double price, char symbol, long quantity){
		
		
		this.diameter=diameter;
		this.color=color;
		this.material=material;
		this.hasPattern=hasPattern;
		this.price=price;
		this.symbol=symbol;
		this.quantity=quantity;
		
	}
	
	public void printInstanceVariables(){
		
		System.out.println("diameter: " + diameter);
		System.out.println("color: " + color);
		System.out.println("material: " + material);
		System.out.println("hasPattern: " + hasPattern);
		System.out.println("price: " + price);
		System.out.println("symbol: " + symbol);
		System.out.println("quantity: " + quantity);
		System.out.println();
	}
	
	 public static void main(String[] args) {
        Plate plate1 = new Plate(10, "White", "Porcelain", true, 9.99, 'A', 100L);
        Plate plate2 = new Plate(8, "Blue", "Ceramic", false, 7.99, 'B', 200L);
        Plate plate3 = new Plate(12, "Red", "Glass", true, 12.99, 'C', 150L);
        Plate plate4 = new Plate(9, "Green", "Melamine", false, 5.99, 'D', 250L);
        Plate plate5 = new Plate(11, "Yellow", "Plastic", true, 3.99, 'E', 300L);
        Plate plate6 = new Plate(7, "Black", "Stoneware", false, 8.99, 'F', 350L);
        Plate plate7 = new Plate(13, "Orange", "Bamboo", true, 6.99, 'G', 400L);
        Plate plate8 = new Plate(10, "Purple", "Acrylic", false, 4.99, 'H', 450L);
		
		plate1.printInstanceVariables();
        plate2.printInstanceVariables();
        plate3.printInstanceVariables();
        plate4.printInstanceVariables();
        plate5.printInstanceVariables();
        plate6.printInstanceVariables();
        plate7.printInstanceVariables();
        plate8.printInstanceVariables();
	
}



}