package lecture_2.payment_of_bills;

public class Solution {

    private int balance = Integer.MAX_VALUE;

    public void processPayment(String cheque){
        try {
            System.out.println("Денег на счету - " + this.balance);
            int money = Integer.parseInt(cheque);
            this.balance -= money;
            System.out.println("Чек прошел, денег на счету - " + this.balance);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }


}
