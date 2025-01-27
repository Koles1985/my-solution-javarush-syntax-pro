package Level_14.getting_to_know_the_collection_hashmap.student_academic_perfofmance_part_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {

        addStudents(grades);
        printStudents(grades);
        System.out.printf("Общий бал студентов = %f\n", getAverageMark(grades));
    }

    private static void printStudents(Map<String, Double> map){
        for(String text: map.keySet()){
            System.out.printf("Key = \"%s\"\n", text);
        }
    }

    private static double getAverageMark(Map<String, Double> map){
        int count = 0;
        double totalScore = 0d;
        for (var entry: map.entrySet()){
            count++;
            totalScore += entry.getValue();

        }

        return  totalScore / (double) (count > 0 ? count : -1);
    }

    private static void addStudents(Map<String, Double> map){
        map.put("Tom Hardley", 4.3d);
        map.put("Elissa Mosly", 5.2d);
        map.put("Endy Dragert", 2.7d);
        map.put("Vanessa Grudly", 1.3d);
        map.put("Albert Enshteinov", 9.7d);
    }
}
