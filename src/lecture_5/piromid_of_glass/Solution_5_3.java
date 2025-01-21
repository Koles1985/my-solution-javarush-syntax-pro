package lecture_5.piromid_of_glass;

import java.util.ArrayList;
import java.util.List;

public class Solution_5_3 {

    private List<String> glasses;

    public Solution_5_3() {
        glasses = new ArrayList<>();
        add();
        printList(glasses);
    }

    private String first = "     +     ";
    private String second = "    + +    ";
    private String third = "   + + +   ";
    private String fourth = "  + + + +  ";
    private String fivth = " + + + + + ";
    private String sixth = "+ + + + + +";


    private void add(){
        glasses.add(sixth);
        glasses.add(fivth);
        glasses.add(fourth);
        glasses.add(third);
        glasses.add(second);
        glasses.add(first);
    }

    public void removeGlassesRevers(){
        int i = 0;
        do{
            i = glasses.size();
            glasses.remove(i-1);
            printList(glasses);

        }while (!glasses.isEmpty());
    }

    private void printList(List<String> list){
        for(String s: list){
            System.out.println(s);
        }
        System.out.println(("________________________"));
    }
}

