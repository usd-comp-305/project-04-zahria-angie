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
}
