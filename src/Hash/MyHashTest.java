package Hash;

public class MyHashTest {
    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("lee", "0001");
        mainObject.saveData("kim", "0002");
        mainObject.saveData("kill", "0003");
        mainObject.saveData("kimberly", "0004");
        System.out.println(mainObject.getData("kim"));
        // 앞 글자가 같기 때문에 덮어씌워져 버림
        // 충돌 발생 -> 링크드 리스트로 연결 하는 것이 chaining (open hashing)
        // 충돌 발생 -> 해당 주소의 다음 주소에 처음 나오는 빈 공간에 저장 (close hashing)
    }
}
