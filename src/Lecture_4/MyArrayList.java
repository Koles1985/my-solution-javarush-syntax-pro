package Lecture_4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList{

    private int capacity;
    private int size;
    private String[] elements;

    public MyArrayList () {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String string){
        if(size == capacity){
            grow();
        }
            elements[size] = string;
            size++;
    }

    private void grow(){
        capacity = (int)(capacity * 1.5);
        String[] temp = elements;
        elements = new String[capacity];
        for(int i = 0; i < temp.length; i++){
            elements[i] = temp[i];
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
}

