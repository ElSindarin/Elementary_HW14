import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DataCollection implements Comparator<Element> {
    private Strategy strategy;
    private List<Element> collection;

    public DataCollection(Strategy strategy, List<Element> collection) {
        this.strategy = strategy;
        this.collection = collection;
    }

    public void showStrategy() {
        strategy.showStrategy();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Collection<Element> getCollection() {
        return collection;
    }

    public void setCollection(List<Element> collection) {
        this.collection = collection;
    }

    public void addData (Element element) {
        strategy.addData(this, element);
    }

    @Override
    public int compare(Element o1, Element o2) {
        return o1.compareTo(o2);
    }

    public static void showCollection (DataCollection dataCollection) {
        System.out.println(dataCollection.collection);
    }
}
