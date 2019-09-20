import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DataCollection{
    private Strategy strategy;
    private List<Element> collection;

    public DataCollection(Strategy strategy, List<Element> collection) {
        this.strategy = strategy;
        this.collection = collection;
    }

    public void showStrategy() {
        strategy.showStrategy();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Collection<Element> getCollection() {
        return collection;
    }

    public void addData (Element element) {
        strategy.addData((List)this.getCollection(), element);
    }

    public static void showCollection (DataCollection dataCollection) {
        System.out.println(dataCollection.collection);
    }
}
