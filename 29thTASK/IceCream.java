class IceCream
{
    String name = "pista";
    int pices;
    String  ingredients;
    int prize= 10;

    IceCream()
    {
        System.out.println("Running the deafault constructer");
    }

}

class IceCreamRunner 
{
    public static void main(String [] args)
    {
        IceCream ref = new IceCream();

        System.out.println("The IceCream name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}