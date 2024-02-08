package algorithms.datastructure;

public class MyHashTable {
    private String[] table ;

    public MyHashTable(int capacity){
           table = new String[capacity];
    }

    public int getHashValue(String word){
        int number = word.hashCode();
        return number % table.length;
    }

    public void insert(String word){
        int hashNumber = getHashValue(word);
        table[hashNumber] = word;
    }

    public int get(String word){
        int hashValue = getHashValue(word);
        if(word.equals(table[hashValue]))
            return hashValue;
        return -1;
    }


}
