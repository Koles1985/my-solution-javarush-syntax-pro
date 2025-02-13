package Level_15.lecture_3.throw_exception.buy_elephant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String unswer, Scanner scanner){
        if(unswer == null)
            System.out.println("Купи слона");
        else if(unswer.toLowerCase().equals("ok")) {
            System.out.println("так то лучше :)  спмсок твоих отговорок: ");
            throw new SecurityException();
        }else
            System.out.println("Все говорят \"" + unswer + "\", а ты купи слона");

        unswer = scanner.nextLine();

        try{
            buyElephant(unswer, scanner);
        }catch (Exception e){
            System.out.println("Ответ = " + unswer );
            throw e;
        }

    }
}
