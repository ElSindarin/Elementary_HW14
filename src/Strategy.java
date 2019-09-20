import java.util.List;

public interface Strategy {
    void addData(List<Element> list, Element element);
    void showStrategy();
}
