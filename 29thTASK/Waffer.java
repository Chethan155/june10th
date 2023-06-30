class Waffer{
    String name = "perk";
    int pices;
    String  ingredients;
    int prize= 35;

    Waffer()
    {
        System.out.println("Running the deafault constructer");
    }

}

class wafferRunner 
{
    public static void main(String [] args)
    {
        Waffer ref = new Waffer();

        System.out.println("The Waffer name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}