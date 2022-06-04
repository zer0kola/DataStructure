package BasicSort;

import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber1 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            randomNumber1.add((int) (Math.random() * 100));
        }
        ArrayList<Integer> randomNumber2 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            randomNumber2.add((int) (Math.random() * 100));
        }
        ArrayList<Integer> randomNumber3 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            randomNumber3.add((int) (Math.random() * 100));
        }
        System.out.println(randomNumber1);
        BubbleSort bubble = new BubbleSort();
        bubble.sort(randomNumber1);
        System.out.println(randomNumber1);
        System.out.println("---------------");
        System.out.println(randomNumber2);
        SelectionSort selection = new SelectionSort();
        selection.sort(randomNumber2);
        System.out.println(randomNumber2);
        System.out.println("---------------");
        System.out.println(randomNumber3);
        InsertionSort insertion = new InsertionSort();
        insertion.sort(randomNumber3);
        System.out.println(randomNumber3);
    }
}
