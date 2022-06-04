package Search;

import java.util.ArrayList;

public class Sequential {
    public static void main(String[] args) {
        Sequential sObj = new Sequential();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random()*100));
        }
        System.out.println(testData.toString());
        System.out.println(sObj.search(testData, 30));
    }

    public int search(ArrayList<Integer> arr, int searched){
        for (int i = 0; i <arr.size() ; i++) {
            if (arr.get(i) == searched) return i;
        }
        return -1;
    }
}
