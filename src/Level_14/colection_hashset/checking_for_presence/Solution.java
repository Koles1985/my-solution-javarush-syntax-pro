package Level_14.colection_hashset.checking_for_presence;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(){{
            add("Hi");
            add("Hello");
            add("Holo");
            add("Gutn tak");
            add("Привет");
        }};
        checkWords("Прив", set);
    }

    public static boolean checkWords(String string, Set<String> hashSet){
        if(hashSet.contains(string)){
            System.out.printf("Слово [%s] есть в множестве", string);
            return true;
        }else {
            System.out.printf("Слова [%s] нет в множестве", string);
            return false;
        }
    }
}
