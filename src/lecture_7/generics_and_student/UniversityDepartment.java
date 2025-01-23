package lecture_7.generics_and_student;

import java.util.List;

public class UniversityDepartment{

    
    public void printStudentNames(List<Student> students){
        for(Student student: students){
            System.out.println(student.getName());
        }
    }
}
