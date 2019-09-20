import java.util.List;

public class NoSortStrategy implements Strategy {

    @Override
    public void addData(List<Element> list, Element element) {
        list.add(element);
    }

    @Override
    public void showStrategy() {
        System.out.println("This is No Sort strategy");
    }
}
