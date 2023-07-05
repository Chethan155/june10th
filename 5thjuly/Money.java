class Money{
	String country;
	String currency;
	int denomination;
	String type;
	
	Money(String country){
		System.out.println("Money running with String arg :");
		this.country=country;
	}
	Money(String country){
		this(country)
		System.out.println("Money running with String and String :");
		this.currency=currency;
	}
        Money(String country){
		this(country,currency)
		System.out.println("Money running with String , String and  int :");
		this.denomination=denomination;
	}
	 Money(String country){
		this(country,currency,denomination)
		System.out.println("Money running with String , String, int and String :");
		this.type=type;
	}
	
}

class MoneyRunner{
	
	public static void main(String [] runner ){
		System.out.println("running main..")
		
		money amount = new ("India","rupees",50,"paper note")
		System.out.println("Country :"+amount.country);
		System.out.println("currency :"+amount.currency);
		System.out.println("denomination:"+amount.denomination);
		System.out.println("type :"+amount.type);
	}
}