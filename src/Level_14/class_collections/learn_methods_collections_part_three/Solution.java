package Level_14.class_collections.learn_methods_collections_part_three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3,6,3,7,3,8,9,0,4,1,6);
        System.out.println(min(list));
        System.out.println("_________________");
        System.out.println(max(list));
        System.out.println("_________________");
        System.out.println(frequency(list, 9));
        System.out.println("_________________");
        System.out.println(binarySearch(list, 4));
        System.out.println("_________________");
    }

    private static int min(List<Integer> list){
        return Collections.min(list);
    }

    private static int max(List<Integer> list){
        return Collections.max(list);
    }

    private static int frequency(List<Integer> list, Integer o){
        return Collections.frequency(list, o);
    }

    private static int binarySearch(List<Integer> list, Integer o){
        Collections.sort(list);
        return Collections.binarySearch(list, o);
    }


}
