package Level_14.loop_for_each.find_and_neutralize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(){{
            add("Bug");
            add("bUg");
            add("text");
            add("some text");
            add("buG");
            add("also text");
            add("BUG");
        }};

        List<String> list2 = new ArrayList<>(){{
            add("Bug");
            add("bUg");
            add("text");
            add("some text");
            add("buG");
            add("also text");
            add("BUG");
        }};

        List<String> list3 = new ArrayList<>(){{
            add("Bug");
            add("bUg");
            add("text");
            add("some text");
            add("buG");
            add("also text");
            add("BUG");
        }};

        System.out.println("List before = " + list);
        System.out.println("________________________");
        removeBugWithFor(list);
        System.out.println("List after = " + list);
        System.out.println("________________________");
        System.out.println("List2 before = " + list2);
        System.out.println("________________________");
        removeBugWithWhile(list2);
        System.out.println("List2 after = " + list2);
        System.out.println("________________________");
        System.out.println("List3 before = " + list3);
        System.out.println("________________________");
        removeBugWithCopy(list3);
        System.out.println("List3 after" + list3);
        System.out.println("________________________");
    }

    private static void removeBugWithFor(List<String> list){
        String bug = "bug";
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equalsIgnoreCase(bug)){
                list.remove(i);
                i--;
            }
        }
    }

    private static void removeBugWithWhile(List<String> list){
        String bug = "bug";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase(bug)){
                iterator.remove();
            }
        }
    }

    private static void removeBugWithCopy(List<String> list){
        String bug = "bug";
        List<String> copy = new ArrayList<>(list);
        for(String s: copy){
            if(s.equalsIgnoreCase(bug)){
                list.remove(s);
            }
        }
    }
}
