public class NoSortStrategy implements Strategy {
    @Override
    public void addData(DataCollection dataCollection, Element element) {
        dataCollection.getCollection().add(element);
    }

    @Override
    public void showStrategy() {
        System.out.println("This is No Sort strategy");
    }
}
