package Heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap(int data) {
        heapArray = new ArrayList<Integer>();
        // heap에는 편의성을 위해 0번에는 null을 저장
        // 1번에 루트노드를 저장
        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean insert(int data) {
        int insertIndex, parentIndex;
        if (heapArray == null) {
            heapArray = new ArrayList<Integer>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }
        this.heapArray.add(data);
        insertIndex = this.heapArray.size() - 1;
        //힙의 마지막 노드에 새로운 요소를 삽입
        while (this.moveUp(insertIndex)) {
            //만약 새로운 요소가 부모 노드보다 크다면 크지 않을 때까지 바꾼다
            parentIndex = insertIndex / 2;
            Collections.swap(this.heapArray, insertIndex, parentIndex);
            insertIndex = parentIndex;
        }
        return true;
    }

    public int pop() {
        int returnedData, poppedIndex, leftChild, rightChild;
        if (this.heapArray != null) {
            returnedData = this.heapArray.get(1);
            this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
            this.heapArray.remove(this.heapArray.size() - 1);
            poppedIndex = 1;

            while (this.moveDown(poppedIndex)) {
                leftChild = poppedIndex * 2;
                rightChild = poppedIndex * 2 + 1;

                if (rightChild >= this.heapArray.size()) {
                    //Case 2: 오른쪽 자식 노드만 없을 때
                    if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChild)) {
                        Collections.swap(this.heapArray, poppedIndex, leftChild);
                        poppedIndex = leftChild;
                    }
                } else {
                    if (this.heapArray.get(leftChild) > this.heapArray.get(rightChild)) {
                        if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChild)) {
                            Collections.swap(this.heapArray, poppedIndex, leftChild);
                            poppedIndex = leftChild;
                        } else {
                            if (this.heapArray.get(poppedIndex) < this.heapArray.get(rightChild)) {
                                Collections.swap(this.heapArray, poppedIndex, rightChild);
                                poppedIndex = rightChild;
                            }
                        }
                    }
                    return this.heapArray.get(1);
                }
            }
        }

    }

    public boolean moveUp(int insertIndex) {
        if (insertIndex <= 1) {
            return false;
            // 삽입하는 노드가 루트 노드면 false
        }
        int parentIndex = insertIndex / 2;
        if (this.heapArray.get(insertIndex) > this.heapArray.get(parentIndex)) {
            // 삽입하는 노드가 부모 노드보다 크면 바꿔야 하므로 true
            return true;
        } else return false;
    }

    public boolean moveDown(int poppedIndex) {
        int leftChild, rightChild;
        leftChild = poppedIndex * 2;
        rightChild = poppedIndex * 2 + 1;

        if (leftChild >= this.heapArray.size()) {//Case 1: 자식 노드가 하나도 없을 때
            return false;
        } else if (rightChild >= this.heapArray.size()) {
            //Case 2: 오른쪽 자식 노드만 없을 때
            if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChild)) {
                return true;
            } else
                return false;
        } else {//Case 3: 자식 노드가 둘 다 있을 때
            if (this.heapArray.get(leftChild) > this.heapArray.get(rightChild)) {
                if (this.heapArray.get(poppedIndex) < this.heapArray.get(leftChild)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (this.heapArray.get(poppedIndex) < this.heapArray.get(rightChild)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


}
   

