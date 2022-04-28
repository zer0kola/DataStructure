package LinkedList;

public class SingleLinkedList<T>{
    public Node<T> head = null;

    public void addNode(T data){
        if(head == null){
            head = new Node<>(data);
            // 아무 것도 없으면 head 노드
        }else{
            Node<T> current = this.head;
            while(current.next != null) {
                current = current.next;
            }// 넥스트 노드가 없는 마지막 노드를 찾아감
            current.next = new Node<>(data);
            // 마지막 노드 뒤에 새로운 노드를 삽입
        }
    }

    public void addNodeInside(T data, T isData){
            Node<T> searchedNode = this.search(isData);

            if (searchedNode == null){
                this.addNode(data);
            }else{
                Node<T> nextNode = searchedNode.next;
                searchedNode.next=new Node<>(data);
                // 원래 다음 노드를 가리키던 포인터를 가져옴
                searchedNode.next.next=nextNode;
                // 새로 추가한 노드의 포인터는 원래 다음 노드를 가리킴
            }

    }

    public Node<T> search (T data){
        if (head != null){
            Node<T> current = this.head;
            while(current.next != null){
                if (current.data == data)
                    return current;
                else current= current.next;
            }
        }
        return null;
    }

    public void printAll(){
        if (head != null){
            Node<T> current = this.head;
            System.out.println(current.data);
            while(current.next!=null){
                current = current.next;
                System.out.println(current.data);
            }
        }
    }
}
