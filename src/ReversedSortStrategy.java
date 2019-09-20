import java.util.Collections;
import java.util.List;

public class ReversedSortStrategy implements Strategy {
    @Override
    public void addData(List<Element> list, Element element) {
        list.add(element);
        Collections.sort(list, Collections.reverseOrder());
    }

    @Override
    public void showStrategy() {
        System.out.println("This is Reversed Sort strategy");
    }
}
