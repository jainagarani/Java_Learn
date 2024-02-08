package enpahse;
/*
There is an app drawer which on the top 2 rows represents the most recently used apps and most frequently used apps respectively.
You are required to provide a method which will have
accessAPP(String appName) call for recording the app access and another method
Map<String, List<String>>openDrawer() which will return the provided two rows.
Each row can contain a max of 5 entries.
 */


import java.util.*;
import java.util.stream.Collectors;

public class AppDrawer extends LinkedHashMap{

    Map<String, Integer> recentlyUsed = new LRUCache();
    Map<String, Integer> frequentlyAccessed = new HashMap<>();

    public void accessAPP(String appName){
        if(recentlyUsed.containsKey(appName)){
            recentlyUsed.put(appName, recentlyUsed.get(appName)+1);
        }else{
            recentlyUsed.put(appName, 1);
        }
        if(frequentlyAccessed.containsKey(appName)){
            frequentlyAccessed.put(appName, frequentlyAccessed.get(appName)+1);
        }else{
            frequentlyAccessed.put(appName, 1);
        }

    }


    public Map<String, List<String>> openDrawer(){
        Map<String, List<String>> result = new HashMap<>();


        result.put("RECENTLY_USED", getRecentlyUsedTop5());
       result.put("FREQUENTLY_USED", getFrequentlyUsedTop5());
        return result;
    }

    public List<String> getRecentlyUsedTop5(){

        List<String> recentlyUsedList = new ArrayList<>();

        recentlyUsed.keySet().forEach(e-> recentlyUsedList.add(e));
        Collections.reverse(recentlyUsedList);
        List recentlyUsedListFinal = recentlyUsedList.stream().limit(2).collect(Collectors.toList());
        return recentlyUsedListFinal;
    }

    public List<String> getFrequentlyUsedTop5(){

        List<String> frequentlyUsedList = new ArrayList<>();

        Map<String, Integer> frequentlyAccessedOrderedMap =frequentlyAccessed.entrySet().stream().sorted((e1,e2) -> e2.getValue()-e1.getValue()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
        frequentlyUsedList = frequentlyAccessedOrderedMap.keySet().stream().limit(5).collect(Collectors.toList());

        frequentlyUsedList.forEach(e -> System.out.println(e));
        return frequentlyUsedList;
    }

    /*public String maximumNumberOfAccessedApplication(){
        Set<String>  keys = applicationAccessCount.keySet();
        String applicationName = null;
        int maxCount = -1 ;
        for(String key : keys){
          int  count = applicationAccessCount.get(key);
          if(count > maxCount){
              maxCount = count;
              applicationName = key;
          }
        }
        return applicationName;
    }*/

    public static void main(String[] args){
        AppDrawer appDrawer = new AppDrawer();
        appDrawer.accessAPP("clock");
        appDrawer.accessAPP("clock");
        appDrawer.accessAPP("clock");
        appDrawer.accessAPP("Calculator");
        appDrawer.accessAPP("WhatsApp");
        appDrawer.accessAPP("WhatsApp");
        appDrawer.accessAPP("text");
        appDrawer.accessAPP("text");
        appDrawer.accessAPP("Mail");
        appDrawer.accessAPP("Message");
        appDrawer.accessAPP("Notes");
        appDrawer.openDrawer().entrySet().forEach((e)-> {
            System.out.println(e);
            System.out.println(e.getValue());
        });

    }
}
