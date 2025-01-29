package Level_14.getting_to_know_the_collection_hashmap.student_academic_perfomance_part_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {

        addStudents(grades);
        entrySet(grades);
    }

    private static void entrySet(Map<String, Double> map){
        for(var entrySet: map.entrySet()){

            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }

    private static void addStudents(Map<String, Double> map){
        map.put("Tom Hardley", 4.3d);
        map.put("Elissa Mosly", 5.2d);
        map.put("Endy Dragert", 2.7d);
        map.put("Vanessa Grudly", 1.3d);
        map.put("Albert Enshteinov", 9.7d);
    }
}
