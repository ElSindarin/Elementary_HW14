import java.util.Collections;
import java.util.List;

public class RegularSortStrategy implements Strategy {
    @Override
    public void addData(DataCollection dataCollection, Element element) {
        dataCollection.getCollection().add(element);
        Collections.sort((List<Element>)dataCollection.getCollection());
    }

    @Override
    public void showStrategy() {
        System.out.println("This is Regular Sort strategy");
    }
}
