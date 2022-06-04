package BasicSort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int minIndex;
        for (int index1 = 0; index1 < dataList.size() - 1; index1++) {
            minIndex = index1;

            for (int index2 = index1 + 1; index2 < dataList.size(); index2++) {
                if (dataList.get(minIndex) > dataList.get(index2)) {
                    minIndex = index2;
                }
            }

            Collections.swap(dataList,index1,minIndex);
        }
        return dataList;
    }
}
