package Level_14.enums.list_quests_javarush;

public class Solution {
    public static void main(String[] args) {
        for(JavarushQuests jrq : JavarushQuests.values()){
            System.out.println(jrq.ordinal());
        }
    }
}
