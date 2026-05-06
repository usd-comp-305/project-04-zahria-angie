package edu.sandiego.comp305;

public class ConcreteCroissant extends Croissant{
    public ConcreteCroissant(){
        this.description = "Croissant";
    }

    @Override
    public String getDescription(){
        return this.description;
    }

    @Override
    public double getPrice() {
        return 3.99;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing croissant...");
    }
}
