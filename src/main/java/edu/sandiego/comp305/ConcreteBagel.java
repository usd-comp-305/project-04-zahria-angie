package edu.sandiego.comp305;

public class ConcreteBagel extends Bagel{
    public ConcreteBagel(){
        this.description = "Bagel";
    }

    @Override
    public String getDescription()
    {return this.description;}

    @Override
    public double getPrice(){
        return 2.99;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing bagel...");
    }


}
