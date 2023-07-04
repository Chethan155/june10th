class Kebab{
	String name = "mutton kebab";
	double price ;
	String HotelName = "vaishali"
	int noOfPieces takeway;
	
	
	kebab(){
		System.out.println("running with  no-args");
	}
	Kebab(String name)
	{
		System.out.println("running kebab  const with String ");
		this.name=name;
	}
	Kebab(String name ,double price)
	{
		System.out.println("running kebab  const with String and double  ");
		this.name=name;
		this.price=price;
	}
	Kebab(String name,double price,String hotelName)
	{
		System.out.println("running kebab  const with String , double and  String");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
	}
	Kebab(String name,double price,String hotelName, int noOfPieces)
	{
		System.out.println("running kebab  const with String , double, String and int ");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.noOfPicecs=noOfPicecs;
	}
	Kebab(String name,double price,String hotelName, int noOfPieces,boolean takeAway)
	{
		System.out.println("running kebab  const with String , double, String and int ");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.noOfPicecs=noOfPicecs;
		this.takeaway=takeAway;
	}
}