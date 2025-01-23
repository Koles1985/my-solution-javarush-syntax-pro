package lecture_7.generics_and_student;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(){{
            add(new Student("Victor"));
            add(new Student("Vasya"));
            add(new Student("Olya"));
            add(new Student("Gena"));
        }};

        UniversityDepartment universityDepartment = new UniversityDepartment();
        universityDepartment.printStudentNames(studentList);
    }

}


