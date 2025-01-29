package Level_14.getting_to_know_the_collection_hashmap.arraylist_vs_hashmap;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Piton", "Java", "JavaScript", "C++", "C#", "Kotlin");
        Map<Integer, String> map = getProgrammingLanguages(list);

        System.out.println(map);
    }

    private static Map<Integer, String> getProgrammingLanguages(List<String> list){
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(i, list.get(i));
        }

        return map;
    }
}
