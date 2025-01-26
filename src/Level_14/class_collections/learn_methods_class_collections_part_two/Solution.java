package Level_14.class_collections.learn_methods_class_collections_part_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11,26,467,21,468,2,678,99,32,1,5,2,8,4,2,6,7);
        sort(list);
        System.out.println(list);
        System.out.println("_____________________________-");
        rotate(list, 7);
        System.out.println(list);
        System.out.println("_____________________________-");
        reverse(list);
        System.out.println(list);
        System.out.println("_____________________________-");
        shuffle(list);
        System.out.println(list);
        System.out.println("_____________________________-");

    }

    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }

    public static void sort(List<Integer> list){
        Collections.sort(list);
    }

    public static void rotate(List<Integer> list, int distance){
        Collections.rotate(list, distance);
    }

    public static void shuffle(List<Integer> list){
        Collections.shuffle(list);
    }
}
