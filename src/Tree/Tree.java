package Tree;

public class Tree {
    Node root = null;

    public void insertNode(int data) {
        // case 1: 노드가 하나도 없을 때
        if (this.root == null) {
            this.root = new Node(data);
        } else { // case 2: 노드가 하나 이상 있을 때
            Node currentNode = this.root;
            while (true) {
                if (currentNode.data > data) {
                    // case 2-1: 현재 노드의 왼쪽에 삽입해야 할 때
                    if (currentNode.leftChildNode != null) {
                        currentNode = currentNode.leftChildNode;
                    } else {
                        currentNode.leftChildNode = new Node(data);
                        break;
                    }
                } else {
                    // case 2-2: 현재 노드의 오른쪽에 삽입해야 할 때
                    if (currentNode.rightChildNode != null) {
                        currentNode = currentNode.rightChildNode;
                    } else {
                        currentNode.rightChildNode = new Node(data);
                        break;
                    }
                }
            }
        }
    }

    public Node search(int data) {
        if (this.root == null) {//Case 1: 노드가 하나도 없을 때
        } else {//Case 2: 노드가 하나 이상 있을 떄
            Node findNode = this.root;
            while (findNode != null) {
                if (findNode.data == data) {
                    return findNode;
                } else if (data < findNode.data) {
                    findNode = findNode.leftChildNode;
                } else {
                    findNode = findNode.rightChildNode;
                }
            }
        }
        return null;
    }

    public boolean deleteNode(int data) {
        boolean searched = false;
        Node currentParent = this.root;
        Node current = this.root;
        // corner case 1: node가 하나도 없을 때
        if (this.root == null) {
            return false;
        } else { // corner case 2: 노드가 1개이고 그 노드를 삭제할 때
            if (this.root.data == data && this.root.leftChildNode == null && this.root.rightChildNode == null) {
                this.root = null;
                return true;
            }
            while (current != null) {
                if (current.data == data){
                    searched = true;
                    break;
                }else if (data < current.data) {
                    currentParent = current;
                    current = current.leftChildNode;
                }else {
                    currentParent = current;
                    current = current.rightChildNode;
                }
                if (searched == false){
                    return false;
                }

                // 여기까지 실행되면 current는 지우려는 노드가 지정됨

                //Case 1: 삭제하려는 노드가 leaf 노드인 경우 부모노드의 연결을 끊어버림
                if (current.rightChildNode ==null&& current.leftChildNode==null){
                    if (current.data > currentParent.data){
                    currentParent.rightChildNode = null;
                    return true;
                    }else {
                        currentParent.leftChildNode = null;
                        return true;
                    }
                }else if (current.rightChildNode ==null){
                    //Case 2-1: 왼쪽 자식만 가지고 있는 노드 삭제
                    if (current.data > currentParent.data){
                        currentParent.rightChildNode = current.leftChildNode;
                        current = null;
                        return true;
                    }else {
                        currentParent.leftChildNode = current.leftChildNode;
                        current = null;
                        return true;
                    }
                }else if (current.leftChildNode ==null){
                    //Case 2-2: 오른쪽 자식만 가지고 있는 노드 삭제
                    if (current.data > currentParent.data){
                        currentParent.rightChildNode = current.rightChildNode;
                        current = null;
                        return true;
                    }else {
                        currentParent.leftChildNode = current.rightChildNode;
                        current = null;
                        return true;
                    }
                }else {//Case 3-1: 삭제할 노드가 부모의 왼쪽에 있고 자식이 2개 있을 떼
                    if (data < currentParent.data) {
                        Node change = current.rightChildNode;
                        Node changeParent = current.rightChildNode;
                        while (change.leftChildNode != null) {
                            changeParent = change;
                            change = change.leftChildNode;
                        }

                        // 여기까지 실행되면 change에는 삭제할 노드의 오른쪽 노드 중 가장 작은 값 저장
                        //Case 3-1-1: 삭제할 노드의 오른쪽 자식 중 가장 작은 값을 가진 자식이 없을 때
                        if (change.rightChildNode == null){
                            changeParent.leftChildNode=change.rightChildNode;
                        }else{//Case 3-1-2: 삭제할 노드의 오른쪽 자식 중 가장 작은 값을 가진 자식이 있을때
                            changeParent.leftChildNode=null;
                        }
                        // currentParent의 왼쪽 자식에 삭제할 노드의 오른쪽 자식중 가장 작은 값을 가진 change를 연결
                        currentParent.leftChildNode = change;
                        change.rightChildNode = current.rightChildNode;
                        change.leftChildNode = current.leftChildNode;
                        current = null;
                        return true;
                    }
                }
            }
        }return false;
    }


}
