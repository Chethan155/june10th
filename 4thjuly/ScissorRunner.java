class ScissorRunner{
    public static void main(String[] args) 
    {
        System.out.println("running main of ScissorsRunner");

		Scissors ref=new Scissors();
        System.out.println("Name: "+ref.brand);
        System.out.println("Color: "+ref.color );
        System.out.println("Type: "+ref.type);
        System.out.println("Usage: "+ref.usage);
        System.out.println("Size: "+ref.size);
        System.out.println("Price: "+ref.price);
        System.out.println("Material: "+ref.material);


        Scissors ref1=new Scissors("Surgical Scissorss");
        System.out.println("Name: "+ref1.brand);
        System.out.println("Color: "+ref1.color );
        System.out.println("Type: "+ref1.type);
        System.out.println("Usage: "+ref1.usage);
        System.out.println("Size: "+ref1.size);
        System.out.println("Price: "+ref1.price);
        System.out.println("Material: "+ref1.material);


        Scissors ref2=new Scissors("Surgical Scissorss","Silver");
        System.out.println("Name: "+ref2.brand);
        System.out.println("Color: "+ref2.color );
        System.out.println("Type: "+ref2.type);
        System.out.println("Usage: "+ref2.usage);
        System.out.println("Size: "+ref2.size);
        System.out.println("Price: "+ref2.price);
        System.out.println("Material: "+ref2.material);


        Scissors ref3=new Scissors("Surgical Scissorss","Silver","sharpestBlade");
        System.out.println("Name: "+ref3.brand);
        System.out.println("Color: "+ref3.color );
        System.out.println("Type: "+ref3.type);
        System.out.println("Usage: "+ref3.usage);
        System.out.println("Size: "+ref3.size);
        System.out.println("Price: "+ref3.price);
        System.out.println("Material: "+ref3.material);

        Scissors ref4=new Scissors("Surgical Scissorss","Silver","sharpestBlade","Hospital");
        System.out.println("Name: "+ref4.brand);
        System.out.println("Color: "+ref4.color );
        System.out.println("Type: "+ref4.type);
        System.out.println("Usage: "+ref4.usage);
        System.out.println("Size: "+ref4.size);
        System.out.println("Price: "+ref4.price);
        System.out.println("Material: "+ref4.material);

        Scissors ref5=new Scissors("Surgical Scissorss","Silver","sharpestBlade","Hospital",'S');
        System.out.println("Name: "+ref5.brand);
        System.out.println("Color: "+ref5.color );
        System.out.println("Type: "+ref5.type);
        System.out.println("Usage: "+ref5.usage);
        System.out.println("Size: "+ref5.size);
        System.out.println("Price: "+ref5.price);
        System.out.println("Material: "+ref5.material);

        Scissors ref6=new Scissors("Surgical Scissorss","Silver","sharpestBlade","Hospital",'S',4166);
        System.out.println("Name: "+ref6.brand);
        System.out.println("Color: "+ref6.color );
        System.out.println("Type: "+ref6.type);
        System.out.println("Usage: "+ref6.usage);
        System.out.println("Size: "+ref6.size);
        System.out.println("Price: "+ref6.price);
        System.out.println("Material: "+ref6.material);

        Scissors ref7=new Scissors("Surgical Scissorss","Silver","sharpestBlade","Hospital",'S',4166,"metal");
        System.out.println("Name: "+ref7.brand);
        System.out.println("Color: "+ref7.color );
        System.out.println("Type: "+ref7.type);
        System.out.println("Usage: "+ref7.usage);
        System.out.println("Size: "+ref7.size);
        System.out.println("Price: "+ref7.price);
        System.out.println("Material: "+ref7.material);
    }

}