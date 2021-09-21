package algorithms;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LRUHashMap {

    static  final int MAX_SIZE =2;
  /*  HashMap<String,String> map =
     Stream.of(new AbstractMap.SimpleEntry<>("JAI","Jai"),
            new AbstractMap.SimpleEntry<>("Naga","Naga")).
             collect(Collectors.toMap(Map.Entry::getKey,))
*/
          ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue();


}
