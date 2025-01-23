package lecture_7.output_console_any_type;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {


    public static void main(String[] args) {
        var arrayList = new ArrayList<Object>(){{
            add(15);
            add("Hello");
            add(154);
            add("String");
            add(12.43f);
        }};

        printAnything(arrayList);
    }
    private static void printAnything(List<Object> list){
        for(Object o : list){
            System.out.println(o);
        }
    }

}
