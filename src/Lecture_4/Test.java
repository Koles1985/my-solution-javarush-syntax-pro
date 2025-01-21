package Lecture_4;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for(int i = 0; i < 18; i++ ){
            myArrayList.add("Count -" + i);
        }

        System.out.println(myArrayList.toString());
    }
}
