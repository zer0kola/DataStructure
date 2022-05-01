package LinkedList;

public class doubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public void addNode(T data) {
        if (head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
            current.next.prev = current;
            this.tail = current.next;
        }
    }
        public void printAll(){
            if(this.head!=null){
                Node<T> current =this.head;
                System.out.println(current.data);
                while (current.next != null) {
                    current = current.next;
                    System.out.println(current.data);
                }

            }
        }
    public Node<T> searchFromHead (T data){
        if (this.head != null){
            Node<T> current = this.head;
            while(current.next != null){
                if (current.data == data)
                    return current;
                else current= current.next;
            }
        }
        return null;
    }

    public Node<T> searchFromTail (T data){
        if (this.head != null){
            Node<T> current = this.tail;
            while(current.prev != null){
                if (current.data == data)
                    return current;
                else current= current.prev;
            }
        }
        return null;
    }

    public boolean insertToFront(T existedData, T addData) {
        if (this.head == null){
            this.head = new Node<>(addData);
            this.tail = this.head;
            return true;
        } else if (head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head.prev = newHead;
            this.head = newHead;
            return true;
        }else{
            Node<T> node = this.head;
            while(node.next!=null){
                if (node.data == existedData){
                    Node<T> prevNode = node.prev;
                    Node<T> newNode = new Node<>(addData);
                    prevNode.next = newNode;
                    newNode.prev = prevNode;
                    node.prev = newNode;
                    newNode.next=node;
                    return true;
                }
                node=node.next;
            }
        }return false;
    }
}

