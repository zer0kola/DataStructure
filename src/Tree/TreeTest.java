package Tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(6);
        Node testNode = myTree.search(6);
        System.out.println(testNode.data);
    }
}
