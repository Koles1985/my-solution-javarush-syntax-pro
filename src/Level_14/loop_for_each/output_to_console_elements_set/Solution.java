package Level_14.loop_for_each.output_to_console_elements_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(){{
            add("Привет");
            add("Это");
            add("коллекция");
            add("множества ");
            add("по");
            add("имени");
            add("HashSet");
        }};

        print(set);
    }

    private static void print(Set<String> set){
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
