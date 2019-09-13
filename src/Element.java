public class Element implements Comparable<Element>{
    private Object element;

    public Element(Object element) {
        this.element = element;
    }

    // Придумал сортировку для любых элементов просто по длине их строки выводящейся в toString.

    @Override
    public int compareTo(Element o) {
        return Integer.compare(element.toString().length(), o.element.toString().length());
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                '}';
    }
}
