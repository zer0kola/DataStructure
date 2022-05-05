package Heap;

public class HeapTest {
    public static void main(String[] args) {
        Heap HeapTest = new Heap(1);
        HeapTest.insert(3);
        HeapTest.insert(2);
        HeapTest.insert(4);
        HeapTest.insert(6);
        System.out.println(HeapTest.heapArray);
        System.out.println(HeapTest.pop());
        System.out.println(HeapTest.pop());
        System.out.println(HeapTest.heapArray);

    }
}
