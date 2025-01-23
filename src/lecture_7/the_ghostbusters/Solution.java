package lecture_7.the_ghostbusters;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);

    }

    private static void checkElementsType(ArrayList<Object> elements){
        for(Object o : elements){
            String s = o.getClass().toString();
            switch (s){
                case "class java.lang.String" : printString();
                continue;
                case "class java.lang.Integer" : printInteger();
                continue;
                case "class [Ljava.lang.Integer;" : printIntegerArray();
                continue;
                default:
                    printUnknown();
                    continue;
            }
        }
    }

    public static void printString(){
        System.out.println("Sntring");
    }

    public static void printInteger(){
        System.out.println("Integer");
    }

    public static void printIntegerArray(){
        System.out.println("IntegerArray");
    }

    public static void printUnknown(){
        System.out.println("Unknown");
    }


}
