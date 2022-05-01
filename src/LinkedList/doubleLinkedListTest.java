package LinkedList;

public class doubleLinkedListTest {
    public static void main(String[] args) {
        doubleLinkedList<Integer> myList= new doubleLinkedList<>();
        myList.addNode(2);
        myList.addNode(73);
        myList.addNode(449);
        myList.printAll();
        myList.insertToFront(73,34);
        myList.insertToFront(2,3);
        System.out.println("--------------");
        myList.printAll();
    }
}
