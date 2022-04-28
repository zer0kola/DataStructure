package LinkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next);
        myList.printAll();
        System.out.println("---------------");
        myList.addNodeInside(5,1);

        myList.printAll();
    }
}
