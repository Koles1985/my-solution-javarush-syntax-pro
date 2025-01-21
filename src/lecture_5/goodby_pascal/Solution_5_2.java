package lecture_5.goodby_pascal;

import java.util.ArrayList;
import java.util.List;

public class Solution_5_2 {

    private List<String> languages;

    public Solution_5_2() {
        languages = new ArrayList<>();
        addLanguage();
    }

    private void addLanguage() {
        languages.add("Java");
        languages.add("C++");
        languages.add("C#");
        languages.add("Pascal");
        languages.add("Basic");
        languages.add("JavaScript");
    }

    public void removeLanguage(String name){
        if(!languages.contains(name)){
            System.out.printf("Language not found, i'm can't remove this %s language\n", name);
            System.out.println("Try agan!");
            return;
        }
        languages.remove(name);
        System.out.println("Remove successful");

    }

    public void print(){
        for(String s: languages){
            System.out.println(s);
        }
    }
}
