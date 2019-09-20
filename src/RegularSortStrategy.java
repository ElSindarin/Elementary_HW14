import java.util.Collections;
import java.util.List;

public class RegularSortStrategy implements Strategy{

    @Override
    public void addData(List<Element> list, Element element) {
        list.add(element);
        Collections.sort(list);
    }

    @Override
    public void showStrategy() {
        System.out.println("This is Regular Sort strategy");
    }

}
