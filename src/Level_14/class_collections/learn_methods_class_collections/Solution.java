package Level_14.class_collections.learn_methods_class_collections;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addAll(list, "Hello", "Super", "Java", "Language", "Umbrella", "Cheer" ,"Glass", "Hello", "Glass");
        System.out.println(list);
        System.out.println("___________________________");
        List<String> dest = new ArrayList<>();
        addAll(dest, "", "", "", "", "", "", "", "", "", null);
        copy(dest, list);
        System.out.println(dest);
        System.out.println("____________________________");
        replaceAll(list, "Glass", "Cup");
        System.out.println(list);
    }

    private static void copy(List<String> dest, List<String> src){

        Collections.copy(dest, src);
    }

    private static void addAll(List<String> list, String... words){
        Collections.addAll(list,  words);
    }

    private static void replaceAll(List<String> list, String oldValue, String newValue){
        Collections.replaceAll(list, oldValue, newValue);
    }
}
