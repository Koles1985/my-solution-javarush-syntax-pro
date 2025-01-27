package Level_14.getting_to_know_the_collection_hashmap.student_academic_perfofmance;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, Double> grades = new HashMap<>();
    public static void main(String[] args) {

        addStudents();
        System.out.println(grades);

    }

    private static void addStudents(){
        grades.put("Tom Hardley", 4.3d);
        grades.put("Elissa Mosly", 5.2d);
        grades.put("Endy Dragert", 2.7d);
        grades.put("Vanessa Grudly", 1.3d);
        grades.put("Albert Enshteinov", 9.7d);
    }
}
