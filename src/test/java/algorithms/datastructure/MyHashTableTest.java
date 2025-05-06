package algorithms.datastructure;


public class MyHashTableTest {
    MyHashTable myHashTable = new MyHashTable(10);

   public static void main(String[] args){
       MyHashTableTest myHashTableTest = new MyHashTableTest();
       myHashTableTest.test();
   }
    public void test(){
       myHashTable.insert("jai");
       myHashTable.insert("naga");
       assert -1 == myHashTable.get("rani");
       assert 0 == myHashTable.get("jai");
   }
}
