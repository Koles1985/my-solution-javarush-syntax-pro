package Level_14.loop_for_each.translate_iterator_to_loop_for_each;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(){{
            add("This is");
            add("Set");
            add("type of");
            add("HashSet");
        }};
        List<String> list = new ArrayList<>(){{
            add("This is");
            add("list");
            add("type of");
            add("ArrayList");
        }};

        printHashSet(set);
        printList(list);
    }

    private static void printHashSet(Set<String> set){
        for(String s:set){
            System.out.println(s);
        }
    }

    private static void printList(List<String> list){
        for(String s:list){
            System.out.println(s);
        }
    }
}
