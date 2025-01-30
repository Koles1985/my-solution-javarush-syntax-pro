package Level_14.enums.next_month_pleas;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth("JANUARY"));
    }

    private static Month getNextMonth(String month){
        Month month1 = Month.valueOf(month);
        Month[] months = Month.values();
        int numberMonth = month1.ordinal();
        if((numberMonth + 1) > month.length()){
            return months[0];
        }else
            return months[numberMonth + 1];
    }
}
