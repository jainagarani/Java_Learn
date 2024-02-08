package algorithms.datastructure;

public class MyHashTableList {

    int initialSize = 10;
    MyHashEntry[] data = new MyHashEntry[initialSize];

    class MyHashEntry {
        String key;
        String value;
        MyHashEntry next;

        MyHashEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    int getIndex(String key) {
        int hashcode = key.hashCode();
        int index = (hashcode & 0x7fffffff) % initialSize;
        return index;
    }

    public void put(String key, String value) {
        int index = getIndex(key);
        if (data[index] == null) {
            data[index] = new MyHashEntry(key, value);
        } else {
            MyHashEntry myHashEntry = data[index];
            while (!myHashEntry.key.equals(key) && myHashEntry.next != null) {
                myHashEntry = myHashEntry.next;
            }
            myHashEntry = new MyHashEntry(key, value);
        }
    }

    public String get(String key) {
        int index = getIndex(key);
        MyHashEntry myHashEntry = data[index];
        while ( myHashEntry != null && !myHashEntry.key.equals(key) && myHashEntry.next != null) {
            myHashEntry = myHashEntry.next;
        }
        if(myHashEntry != null){
            return myHashEntry.value;
        }
        return "not found";
    }

    public static void main(String[] args){
        MyHashTableList myHashTableList = new MyHashTableList();
        myHashTableList.put("jai", "1");
        myHashTableList.put("jai", "1");
        myHashTableList.put("naga", "2");
        myHashTableList.put("rani", "3");
        System.out.println(myHashTableList.get("jai"));
        System.out.println(myHashTableList.get("uin"));

    }
}
