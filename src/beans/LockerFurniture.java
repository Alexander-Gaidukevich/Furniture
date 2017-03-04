package beans;

import beans.interfaces.IColor;

public class LockerFurniture extends Furniture implements IColor{//наследуемся от класса Furniture

    public final static double COST = 300;

    public LockerFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount(){
        return COST - (COST * 0.3);
    }

    @Override
    public String getColor() {
        return "yellow";
    }

}
