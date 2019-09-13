import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataCollection dataCollection1 = new DataCollection(new RegularSortStrategy(), new ArrayList<>());
        dataCollection1.addData(new Element(126513));
        dataCollection1.addData(new Element("ololololo"));
        dataCollection1.addData(new Element(126513D));
        dataCollection1.addData(new Element(1F));
        DataCollection.showCollection(dataCollection1);
        dataCollection1.showStrategy();
        DataCollection dataCollection2 = new DataCollection(new ReversedSortStrategy(), new ArrayList<>());
        dataCollection2.addData(new Element(126513));
        dataCollection2.addData(new Element("ololololo"));
        dataCollection2.addData(new Element(126513D));
        dataCollection2.addData(new Element(1F));
        DataCollection.showCollection(dataCollection2);
        dataCollection2.showStrategy();
        DataCollection dataCollection3 = new DataCollection(new NoSortStrategy(), new ArrayList<>());
        dataCollection3.addData(new Element(126513));
        dataCollection3.addData(new Element("ololololo"));
        dataCollection3.addData(new Element(126513D));
        dataCollection3.addData(new Element(1F));
        DataCollection.showCollection(dataCollection3);
        dataCollection3.showStrategy();
    }
}
