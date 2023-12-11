import Factory.Furniture;
import Factory.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.createFurniture("Деревянный стул", "chair");
        Furniture table = factory.createFurniture("Стеклянный стол", "table");
        Furniture cabinet = factory.createFurniture("Металлический шкаф", "cabinet");

        System.out.println(chair.describe());
        System.out.println(table.describe());
        System.out.println(cabinet.describe());
    }
}