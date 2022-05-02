package Hash;

public class MyHash {
    public Slot[] hashTable;

    public MyHash(int size) {
        this.hashTable = new Slot[size];
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else{
            this.hashTable[address]=new Slot(value);
        }return true;
    }
public String getData(String key){
        int address = this.hashFunc(key);
        if (this.hashTable[address]!=null){
            return hashTable[address].value;
        }else
            return null;
}

}
