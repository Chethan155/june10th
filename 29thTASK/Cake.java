class Cake{
    String name = "blackforest";
    int pices;
    String  ingredients;
    int prize= 100;

    Cake()
    {
        System.out.println("Running the deafault constructer");
    }

}

class CakeRunner 
{
    public static void main(String [] args)
    {
        Cake ref = new Cake();

        System.out.println("The Cake name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}