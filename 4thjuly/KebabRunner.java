class KebabRunner{
	
	
	public static void main(String [] args){
		System.out.println("running main..");
		
		Kebab ref=new Kebab()
		System.out.println("name : "+ ref.name);
		System.out.println("name : "+ ref.price);
		System.out.println("name : "+ ref.hotelName);
		System.out.println("name : "+ ref.noOfPieces);
		System.out.println("name : "+ ref.takeAway);
		
		Kebab ref1=new Kebab("mutton kebab");
		System.out.println("name : "+ ref1.name);
		System.out.println("name : "+ ref1.price);
		System.out.println("name : "+ ref1.hotelName);
		System.out.println("name : "+ ref1.noOfPieces);
		System.out.println("name : "+ ref1.takeAway
		
		Kebab ref2=new Kebab("mutton kebab",200);
		System.out.println("name : "+ ref2.name);
		System.out.println("name : "+ ref2.price);
		System.out.println("name : "+ ref2.hotelName);
		System.out.println("name : "+ ref2.noOfPieces);
		System.out.println("name : "+ ref2.takeAway);
		
		Kebab ref3=new Kebab("mutton kebab",200,"vaishali");
		System.out.println("name : "+ ref3.name);
		System.out.println("name : "+ ref3.price);
		System.out.println("name : "+ ref3.hotelName);
		System.out.println("name : "+ ref3.noOfPieces);
		System.out.println("name : "+ ref3.takeAway);
		
		Kebab ref4=new Kebab("mutton kebab",200,"vaishali", 7);
		System.out.println("name : "+ ref4.name);
		System.out.println("name : "+ ref4.price);
		System.out.println("name : "+ ref4.hotelName);
		System.out.println("name : "+ ref4.noOfPieces);
		System.out.println("name : "+ ref4.takeAway);
		
		Kebab ref5=new Kebab("mutton kebab",200,"vaishali", 7, true);
		System.out.println("name : "+ ref5.name);
		System.out.println("name : "+ ref5.price);
		System.out.println("name : "+ ref5.hotelName);
		System.out.println("name : "+ ref5.noOfPieces);
		System.out.println("name : "+ ref5.takeAway);
		
		
		
	}
}