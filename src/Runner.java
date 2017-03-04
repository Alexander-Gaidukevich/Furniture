import beans.ChairFurniture;
import beans.LockerFurniture;
import beans.TableFurniture;

public class Runner {

    public static void main(String[] args) {

        ChairFurniture chairFurniture = new ChairFurniture("chairName");
        System.out.println("Cost: " + chairFurniture.getCostWithDiscount());
        System.out.println("Color: " + chairFurniture.getColor());


        TableFurniture tableFurniture = new TableFurniture("tableName");
        System.out.println("Cost: " + tableFurniture.getCostWithDiscount());
        System.out.println("Color: " + tableFurniture.getColor());

        LockerFurniture lockerFurniture = new LockerFurniture("lockerName");
        System.out.println("Cost: " + lockerFurniture.getCostWithDiscount());
        System.out.println("Color: " + lockerFurniture.getColor());

    }

}
