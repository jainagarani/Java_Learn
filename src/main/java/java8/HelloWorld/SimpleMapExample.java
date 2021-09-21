package java8.HelloWorld;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleMapExample {

//    public static void main(String[] args){
//        HashMap<Integer, String> map = new HashMap(Stream.of(new AbstractMap.SimpleEntry<>(1,"Jai"),
//                new AbstractMap.SimpleEntry<>(2,"Apple")
//        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
//        map.forEach((k,v) -> System.out.println(k +" :"+ v));
//       /* Map<Integer,String> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
//                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2) -> e1,  LinkedHashMap::new)
//                );*/
//
//      /*  Map<Integer,String> sortedMap = map.entrySet().stream().sorted((k1,k2) -> k1.getValue().compareTo(k2.getValue())).
//                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2) -> e1,  LinkedHashMap::new));*/
//
//        Map<String,Integer> sortedMap = sortByValue(map);
//        sortedMap.forEach((k,v) -> System.out.println(k +" :"+ v));
//    }
//
//    public static Map<String,Integer>  sortByValue(HashMap<Integer,String> map) {
//        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//       /*// Collections.sort(list, new Comparator<Map.Entry<String, Integer>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });*/
//        Map<String,Integer> sortedMap = list.stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//                return sortedMap;
//    }
//
//


}
