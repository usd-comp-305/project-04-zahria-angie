package edu.sandiego.comp305;

public class AlmondCroissant extends CroissantFlavor{
    public AlmondCroissant(Croissant croissant){
        this.croissant = croissant;
    }

    @Override
    public String getDescription() {
        return "Almond " + croissant.getDescription();
    }

    @Override
    public double getPrice() {
        return croissant.getPrice() + 2.00;
    }

    public void prepare(){
        System.out.println("Adding almonds...");
    }


}
