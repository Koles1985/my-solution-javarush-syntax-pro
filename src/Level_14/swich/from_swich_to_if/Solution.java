package Level_14.swich.from_swich_to_if;

public class Solution {
    public static void main(String[] args) {

        System.out.println(getTranslationForDayOfWeek("Wednesday"));
    }

    private static String getTranslationForDayOfWeek(String dayOfWeek) {
        if (dayOfWeek.equals("Monday")) {
            return "Понедельник";
        } else if (dayOfWeek.equals("Tuesday")) {
            return "Вторник";
        } else if (dayOfWeek.equals("Wednesday")) {
            return "Среда";
        }else if (dayOfWeek.equals("Thursday")) {
            return "Четверг";
        }else if (dayOfWeek.equals("Friday")) {
            return "Пятница";
        }else if (dayOfWeek.equals("Saturday")) {
            return "Суббота";
        }else if (dayOfWeek.equals("Sunday")) {
            return "Воскресенье";
        }else return null;
    }
}
