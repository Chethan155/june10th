class VegPuff
{
    String name = "paneerPuff";
    int pices;
    String  ingredients;
    int prize= 25;

    VegPuff()
    {
        System.out.println("Running the deafault constructer");
    }

}

class VegPuff ()
{
    public static void main(String [] args)
    {
        Sweet ref = new VegPuff();

        System.out.println("The VegPuff name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}