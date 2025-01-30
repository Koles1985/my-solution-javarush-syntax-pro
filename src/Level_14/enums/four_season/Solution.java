package Level_14.enums.four_season;

public class Solution {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for(Season s : Season.values()){
            System.out.println(s.toString());
        }
//        for(int i = 0; i < seasons.length; i++){
//            System.out.println(seasons[i].toString());
//        }
    }
}
