class Biscuit
{
    String name = "cheskamaska";
    int pices;
    String  ingredients;
    int prize= 10;

    Biscuit()
    {
        System.out.println("Running the deafault constructer");
    }

}

class BiscuitRunner 
{
    public static void main(String [] args)
    {
        Biscuit ref = new Biscuit();

        System.out.println("The Biscit name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}