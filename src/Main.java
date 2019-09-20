import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataCollection dataCollection = new DataCollection(new RegularSortStrategy(), new ArrayList<>());

        demonstrateStrategyPattern(dataCollection, new RegularSortStrategy());
        demonstrateStrategyPattern(dataCollection, new ReversedSortStrategy());
        demonstrateStrategyPattern(dataCollection, new NoSortStrategy());
    }

    public static void demonstrateStrategyPattern (DataCollection dataCollection, Strategy strategy) {
        dataCollection.showStrategy();
        dataCollection.setStrategy(strategy);
        dataCollection.addData(new Element(126513));
        dataCollection.addData(new Element("ololololo"));
        dataCollection.addData(new Element(126513D));
        dataCollection.addData(new Element(1F));
        DataCollection.showCollection(dataCollection);
        dataCollection.getCollection().clear();
    }
}
