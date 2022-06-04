package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bObj = new BinarySearch();
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random()*100));
        }
        Collections.sort(testData);
        System.out.println(testData.toString());
        System.out.println(bObj.search(testData, 30));
    }
    public boolean search(ArrayList<Integer> dataList, int searched) {
        if (dataList.size() == 1 && searched == dataList.get(0)) return true;
        if (dataList.size() == 1 && searched != dataList.get(0)) return false;
        if (dataList.size() == 0) return false;
        int median = dataList.size() / 2;
        if (searched == dataList.get(median)) return true;
        else {
            if (searched > dataList.get(median)) {
                return this.search(new ArrayList<Integer>(dataList.subList(median, dataList.size())), searched);
            } else {
                return this.search(new ArrayList<Integer>(dataList.subList(0, median)), searched);
            }
        }
    }

}
