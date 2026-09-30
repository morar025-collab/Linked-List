public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);
        list.addItem(20);
        list.addItem(30);
        list.addItem(40);

        System.out.println("Forward:");
        list.showList();

        System.out.println("Reverse:");
        list.showReverseList();

        System.out.println("Find 20: " + list.find(20));
        System.out.println("Find 100: " + list.find(100));

        list.remove(30);

        System.out.println("After removing 30:");
        list.showList();
    }
}