class Scissors{
    String brand;
    String color;
    String type;
    String usage;
    char size;
    double price;
    String material;

	Scissors()
	{
		System.out.println("Running with no-args");
	}

    Scissors(String brand)
    {
        System.out.println("running Scissors const with String ");
        this.brand=brand;
    }

     Scissors(String brand,String color)
    {
        System.out.println("running Scissors const with String and String ");
        this.brand=brand;
        this.color=color;
    }

     Scissors(String brand,String color,String type)
    {
        System.out.println("running Scissors const with String, String and String ");
        this.brand=brand;
        this.color=color;
        this.type=type;
    }

     Scissors(String brand,String color,String type,String usage)
    {
        System.out.println("running Scissors const with String ,String ,String  and String");
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.usage=usage;
    }

     Scissors(String brand,String color,String type,String usage,char size)
    {
        System.out.println("running Scissors const with String ,String ,String ,String  and char");
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.usage=usage;
        this.size=size;
    }

    Scissors(String brand,String color,String type,String usage,char size,double price)
    {
        System.out.println("running Scissors const with String ,String ,String ,String ,char and double ");
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.usage=usage;
        this.size=size;
        this.price=price;
    }

    Scissors(String brand,String color,String type,String usage,char size,double price,String material)
    {
        System.out.println("running Scissors const with String ,String ,String ,String ,char ,double and String");
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.usage=usage;
        this.size=size;
        this.price=price;
        this.material=material;
    }
}