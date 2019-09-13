import java.util.Collections;
import java.util.List;

public class ReversedSortStrategy implements Strategy {

    @Override
    public void addData(DataCollection dataCollection, Element element) {
        dataCollection.getCollection().add(element);
        Collections.sort((List<Element>)dataCollection.getCollection(), Collections.reverseOrder());
    }

    @Override
    public void showStrategy() {
        System.out.println("This is Reversed Sort strategy");
    }
}
