package BasicSort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int index1 = 0; index1 < dataList.size() -1; index1++) {
            for (int index2 = index1 +1; index2 > 0; index2--) {
                if (dataList.get(index2) < dataList.get(index2-1)){
                    Collections.swap(dataList,index2,index2-1);
                }else break;
            }
        }return dataList;
    }
}
