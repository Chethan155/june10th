class Candy
{
    String name = "kachchamango";
    int pices;
    String  ingredients;
    int prize= 1;

    Candy()
    {
        System.out.println("Running the deafault constructer");
    }

}

class CandyRunner 
{
    public static void main(String [] args)
    {
        Candy ref = new Candy();

        System.out.println("The Candy name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}