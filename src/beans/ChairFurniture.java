package beans;

import beans.interfaces.IColor;

public class ChairFurniture extends Furniture implements IColor {//наследуемся от класса Furniture

    public final static double COST = 100;
    /*final - значение переменной нельзя изменить, static - статическая переменная,
    принадлежит к классу, является общей для всех обьектов.
      Все константы пишутся с большой буквы, не изменняемое в дальнейшем число.  COST_CHAIR*/

    // Конструктор который берет поле из super класса Furniture
    public ChairFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount(){
        return COST - (COST * 0.1);
    }

    @Override
    public String getColor() {
        return "red";
    }
}
