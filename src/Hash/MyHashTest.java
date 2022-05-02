package Hash;

public class MyHashTest {
    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("lee", "0001");
        mainObject.saveData("kim", "0002");
        System.out.println(mainObject.getData("kim"));
    }
}
