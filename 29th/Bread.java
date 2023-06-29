class Bread
{
    String name = "brownbread";
    int pices;
    String  ingredients;
    int prize= 40;

    Bread()
    {
        System.out.println("Running the deafault constructer");
    }

}

class BreadRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Bread();

        System.out.println("The Bread name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}