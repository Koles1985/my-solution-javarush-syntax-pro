package Level_14.colection_hashset.return_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String[] strings = {"Hello", "HI", "prpew", "Hello", "good", "google", "good"};
        HashSet<String> set = arrayToHashSet(strings);
        System.out.println(set.toString());
    }

    public static HashSet<String> arrayToHashSet(String[] stringArray){
        HashSet<String> hashSet = new HashSet<>();
        for(String s: stringArray){
            hashSet.add(s);
        }
        return hashSet;
    }
}
