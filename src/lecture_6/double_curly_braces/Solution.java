package lecture_6.double_curly_braces;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};

        System.out.println(strings);
    }
}
