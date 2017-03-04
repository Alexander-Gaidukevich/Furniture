package beans;

import beans.interfaces.IColor;

public class TableFurniture extends Furniture implements IColor {//наследуемся от класса Furniture

    public final static double COST = 200;

    public TableFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount(){
        return COST - (COST * 0.2);
    }

    @Override
    public String getColor() {
        return "black";
    }

}
