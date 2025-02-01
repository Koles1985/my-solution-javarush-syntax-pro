package Level_14.swich.from_if_to_swich;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(3).toString());
    }
    private static Month getMonthByIndex(int index){
        switch (index - 1){
            case 0 :return Month.JANUARY;
            case 1 :return Month.FEBRARRY;
            case 2 :return Month.MARCH;
            case 3 :return Month.APRIL;
            case 4 :return Month.MAY;
            case 5 :return Month.JUN;
            case 6 :return Month.JUL;
            case 7 :return Month.AUGUST;
            case 8 :return Month.SEPTEMBER;
            case 9 :return Month.OCTOBER;
            case 10 :return Month.NOVEMBER;
            case 11 :return Month.DECEMBER;

            default:return null;

        }
    }
}
